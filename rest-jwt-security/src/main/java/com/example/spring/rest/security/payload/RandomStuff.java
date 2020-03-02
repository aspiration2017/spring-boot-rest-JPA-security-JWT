package com.example.spring.rest.security.payload;

public class RandomStuff {
    private String message;

    public RandomStuff(String message) {
        this.message = message;
    }

    public RandomStuff() {}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
