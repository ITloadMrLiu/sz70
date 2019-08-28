package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: myStudy
 * @description:
 * @author:
 * @create: 2019-08-05 16:26
 **/
@Service("accountSeivice")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public Account findUserByAccountId(int aid) {
        return accountDao.findUserByAccountId(aid);
    }
}
