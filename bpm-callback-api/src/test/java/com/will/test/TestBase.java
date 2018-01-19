package com.will.test;

import org.junit.Test;

/**
 * Created by gao.guangcai on 2018-01-18.
 */
public class TestBase {

    @Test
    public  void Test(){
        String str = "simle";
        System.out.println(str.length());
        System.out.println(str.substring(0,1));
        System.out.println(str.substring(0,2));
        System.out.println(str.substring(0,0));
        System.out.println(str.substring(0,5));
    }
}
