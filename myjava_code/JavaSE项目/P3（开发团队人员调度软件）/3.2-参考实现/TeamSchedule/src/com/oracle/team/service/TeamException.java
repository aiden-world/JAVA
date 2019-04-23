package com.oracle.team.service;

public class TeamException extends Exception {

    public TeamException(Throwable cause) {
        super(cause);
    }

    public TeamException(String message) {
        super(message);
    }
}
