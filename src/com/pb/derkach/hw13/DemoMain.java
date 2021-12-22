package com.pb.derkach.hw13;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoMain {

    public static class Producer extends Thread {
        private final Object lock;
        private final Queue<Integer> queueBuffer;

        public Producer(Object lock, Queue<Integer> queueBuffer) {
            this.lock = lock;
            this.queueBuffer = queueBuffer;
        }

        @Override
        public void run() {
            int number = 0;
            for (int i = 0; i < 50; i++) {

                if (queueBuffer.size()<5) {
                    number += 1;
                    synchronized (lock) {
                        queueBuffer.add(number);
                        lock.notify();

                        if (queueBuffer.size() >= 5) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }

    public static class Consumer extends Thread {
        private final Object lock;
        private final Queue<Integer> queueBuffer;

        public Consumer(Object lock, Queue<Integer> queueBuffer) {
            this.lock = lock;
            this.queueBuffer = queueBuffer;
        }

        @Override
        public void run() {
            int number = 0;
            int counter = 0;
            while (true) {

                if (!queueBuffer.isEmpty()) {
                    synchronized (lock) {
                        number = queueBuffer.remove();
                        lock.notify();

                        if (queueBuffer.isEmpty()) {
                            try {
                                lock.wait(3000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    System.out.print(number + " - ");
                    counter++;
                    if (counter % 10 == 0) {
                        System.out.println();
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();
        Queue<Integer> queueBuffer = new PriorityQueue<>();
        Producer producer = new Producer(lock, queueBuffer);
        Consumer consumer = new Consumer(lock, queueBuffer);

        producer.start();
        consumer.start();

        while (true) {
            if (!producer.isAlive() && queueBuffer.isEmpty()) {
                System.exit(0);
            }
        }
    }
}