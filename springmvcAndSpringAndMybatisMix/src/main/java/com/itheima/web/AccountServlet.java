package com.itheima.web;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @program: myStudy
 * @description:
 * @author:
 * @create: 2019-08-05 16:28
 **/
@Controller("accountServlet")
public class AccountServlet {
    @Autowired
    private AccountService accountService;

    public Account findUserByAccountId(int aid){
        return accountService.findUserByAccountId(aid);
    }

}
