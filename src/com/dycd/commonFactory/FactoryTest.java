package com.dycd.commonFactory;

/**
 * Created by zhangyan on 16/11/25.
 */
public class FactoryTest {
    public static void main(String [] args){
        SenderFactory senderFactory=new SenderFactory();
        Sender sender=senderFactory.product("sms");
        sender.Send();
    }
}
