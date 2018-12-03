package com.yootk.Rent.work3.work3.Dao;

import com.yootk.Rent.work3.Utils.C3P0Utils;
import com.yootk.Rent.work3.work3.Bean.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class TransferModle implements  TransferDao {
    @Override
    public User transfer(String name,int money) throws SQLException {
        QueryRunner queryRunner=new QueryRunner(C3P0Utils.getCom());
       User  query = queryRunner.query("select * from `transfer` where name=?  ;", new BeanHandler<>(User.class), name);
        int newmoney=0;
       if(query!=null) {
           if(name.equals("from")){
            newmoney = query.getMoney() - money;
           }
           else{
               newmoney = query.getMoney() + money;
           }
        }else{
            return null;
        }

        try {
            int x= queryRunner.update("update  `transfer` set money=? where name=?;" ,newmoney,name);
            if(x!=1){
               query=null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }
}
