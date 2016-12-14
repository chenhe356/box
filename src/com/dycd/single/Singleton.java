package com.dycd.single;

/**
 * Created by chenhe on 2016/12/14.
 */
public class Singleton{
    private static Singleton instance=null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
