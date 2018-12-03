package com.yootk.Rent.work3.Utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Utils {
    static ComboPooledDataSource com;
    static {
        com=new ComboPooledDataSource("mysql");
    }
    public  static ComboPooledDataSource getCom(){
        return com;
    }
    public static Connection getConnection() throws SQLException {
        return com.getConnection();
    }
}
