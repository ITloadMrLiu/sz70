package com.itheima.service;

import com.itheima.domain.Account;

public interface AccountService {
    Account findUserByAccountId(int aid);
}
