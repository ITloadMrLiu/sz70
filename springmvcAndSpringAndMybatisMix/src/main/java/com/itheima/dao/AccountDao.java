package com.itheima.dao;

import com.itheima.domain.Account;

public interface AccountDao {
    //根据account的uid查询user表和account表的信息
    Account findUserByAccountId(int aid);
}
