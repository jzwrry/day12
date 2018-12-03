package com.yootk.Rent.work3.work3.Service;

import com.yootk.Rent.work3.work3.Bean.User;
import com.yootk.Rent.work3.work3.Dao.TransferDao;
import com.yootk.Rent.work3.work3.Dao.TransferModle;

import java.sql.SQLException;

public class TransferServiceMain  implements  TransferService {
    TransferDao transferDao=new TransferModle();
    @Override
    public boolean transfer(String from, String to, int money) throws SQLException {
       User fromuser= transferDao.transfer(from,money);
        User touser= transferDao.transfer(to,money);
        if(fromuser!=null&&touser!=null){
            return  true;
        }else
            return false;

    }
}
