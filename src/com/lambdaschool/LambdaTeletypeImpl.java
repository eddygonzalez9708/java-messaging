package com.lambdaschool;

public class LambdaTeletypeImpl implements MessageService
{
    @Override
    public void sendMessage(String msg, String receiveAddress)
    {
        System.out.println(receiveAddress + ":" + msg + ":" + receiveAddress);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
