package com.team3chat.messages;

/**
 * Created by Java_9 on 07.09.2017.
 */
public class ConnectCommand implements Command {
    @Override
    public String getSerializedMessage() {
        return "/connect";
    }
}
