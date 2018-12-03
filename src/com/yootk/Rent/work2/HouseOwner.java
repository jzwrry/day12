package com.yootk.Rent.work2;

public class HouseOwner  implements Rent {
    @Override
    public float isRent(int x) {
        long startTime=System.currentTimeMillis();
        if(x>2800){
            System.out.println("可以租赁");
        }
        else
            System.out.println("不可以租赁");
        for(int x1=0;x1<1000;x1++) {
            System.out.println(x1);
        }
        long endTime=System.currentTimeMillis();
        float excTime=(float)(endTime-startTime);
        return excTime;
    }
}
