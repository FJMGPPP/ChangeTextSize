package com.fjmg.changetextsize.data;

import java.io.Serializable;

public class Message implements Serializable {
    private User user;
    private String message;
    private int Size;

    public Message(User user, String message, int size) {
        this.user = user;
        this.message = message;
        Size = size;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }
}
