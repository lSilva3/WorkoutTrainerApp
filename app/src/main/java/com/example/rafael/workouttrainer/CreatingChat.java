package com.example.rafael.workouttrainer;

import java.util.Date;

/**
 * Created by luis on 05/01/2018.
 */

public class CreatingChat {
    private String messageText;
    private String messageUser;
    private long messageTime;

    public CreatingChat(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;

        messageTime = new Date().getTime();
    }

    public CreatingChat() {
    }



    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}