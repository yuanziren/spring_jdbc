package com.yuanziren.service;

import com.yuanziren.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 转账
     * @param outId
     * @param inId
     * @param money
     */
    public void zhuanzhang(int outId, int inId, double money){
        accountDao.outMoney(outId, money);
        int i = 1/0;
        accountDao.inMoney(inId, money);
    }
}
