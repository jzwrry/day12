package com.yootk.Rent.work3.work3.Service;

import java.sql.SQLException;

public interface TransferService {
    boolean transfer(String from, String to, int money) throws SQLException;
}
