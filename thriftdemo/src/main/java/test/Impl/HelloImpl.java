package test.Impl;

import org.apache.thrift.TException;
import test.Hello;

/**
 * Created by gao.guangcai on 2017-11-10.
 */
public class HelloImpl implements Hello.Iface {

    private static int count= 0;

    @Override
    public String helloString(String word)throws TException
    {
        count += 1;
        System.out.println("get " + word + " " +count);
        return "hello " + word + " " + count;
    }

}
