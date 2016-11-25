package com.dycd.commonFactory;

/**
 * Created by zhangyan on 16/11/25.
 */
public class SenderFactory {
    public Sender product(String type)
    {
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("请输入正确的类型");
            return null;
        }
    }
}
