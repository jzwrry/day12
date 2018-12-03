package com.yootk.Rent.work2;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MainTest {
    @Test
    public void Main(){
        HouseOwner houseOwner =new HouseOwner();  //被包装对象

      //  HouseProxy proxy = new HouseProxy(houseOwner) ; //代理对象
        Rent proxy = (Rent) Proxy.newProxyInstance(HouseOwner.class.getClassLoader(), houseOwner.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object invoke = method.invoke(houseOwner, args);

                        return invoke;  //
                    }
                });

       float x=proxy.isRent(new Renter().getRent());
        System.out.println("运行时间："+x);
    }
}
