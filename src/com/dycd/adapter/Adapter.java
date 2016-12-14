package com.dycd.adapter;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

/**
 * Created by chenhe on 2016/12/14.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is method2");
    }
}
