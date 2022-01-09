package com.pb.derkach.hw14;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Client {
    private static Socket socket;
    private static BufferedReader textConsole;
    private static BufferedReader in;
    private static PrintWriter out;


    public static void main(String[] args) {


        try {
            socket = new Socket("localhost", 8111);
            textConsole = new BufferedReader(new InputStreamReader(System.in));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            System.out.println("Введите текст запроса к серверу: ");
            new ReadMsg().start();
            new WriteMsg().start();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static class ReadMsg extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println(in.readLine());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static class WriteMsg extends Thread {
        LocalDateTime now;
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentTime;
        @Override
        public void run() {
            while (true) {
                now = LocalDateTime.now();
                currentTime = now.format(dateTime);
                try {
                    out.println(currentTime + "=> " + textConsole.readLine());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}