package com.dycd.commonFactory;

/**
 * Created by zhangyan on 16/11/25.
 */
public class MailSender implements Sender
{
    @Override
    public void Send() {
        System.out.println("this is mailSender");
    }
}
