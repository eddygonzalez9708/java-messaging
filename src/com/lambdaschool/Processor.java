package com.lambdaschool;

public interface Processor
{
    void sendMessage(String mgs, String address);
    String readMessage();
}
