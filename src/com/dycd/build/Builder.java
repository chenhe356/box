package com.dycd.build;

import com.dycd.commonFactory.MailSender;
import com.dycd.commonFactory.Sender;
import com.dycd.commonFactory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenhe on 2016/12/14.
 */
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();
    public void productMailSender(int count){
        for(int i=0;i<count;i++){
            list.add(new MailSender());
        }
        System.out.println(list.size());
    }
    public void productSmsSender(int count){
        for(int i=0;i<count;i++){
            list.add(new SmsSender());
        }
    }

}
