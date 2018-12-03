package com.yootk.Rent.work3.work3.Service;



import com.yootk.Rent.work2.HouseOwner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.SQLException;

public class Rent {

        public TransferService Main(){
           TransferServiceMain transferServiceMain=new TransferServiceMain();  //被包装对象
            TransferService proxy = (TransferService) Proxy.newProxyInstance(TransferServiceMain.class.getClassLoader(), transferServiceMain.getClass().getInterfaces(),
                   new InvocationHandler() {
                       @Override
                       public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                           Object invoke = method.invoke(transferServiceMain, args);

                           return invoke;  //
                       }
                   });

          return  proxy;
        }
    }


