package com.yuanziren.service;

import com.yuanziren.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(propagation = Propagation.REQUIRED)
    public void zhuanzhang(int outId, int inId, double money){
        accountDao.outMoney(outId, money);
        int i = 1/0;
        accountDao.inMoney(inId, money);
    }

    public void updateAccountMoney(int outId, int inId, double money){
        accountDao.outMoney(outId, money);
        int i = 1/0;
        accountDao.inMoney(inId, money);
    }
}
