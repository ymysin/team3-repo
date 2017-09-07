package com.team3chat.messages;

/**
 * Created by Java_9 on 07.09.2017.
 */
public class SendMessageCommand {
    private final String message;

    public SendMessageCommand(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}