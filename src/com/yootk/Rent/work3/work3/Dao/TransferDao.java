package com.yootk.Rent.work3.work3.Dao;

import com.yootk.Rent.work3.work3.Bean.User;

import java.sql.SQLException;

public interface TransferDao {
    User transfer(String name,int money) throws SQLException;
}
