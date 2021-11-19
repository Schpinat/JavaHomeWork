package com.pb.derkach.hw8;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(String msgPass) {
        super(msgPass);
    }

}
