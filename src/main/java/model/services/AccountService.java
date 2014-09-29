package model.services;

import model.dao.AccountDao;
import model.entity.Account;
import model.services.base.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * @author Wojtek
 */

@Service
public class AccountService extends BaseService<Account, AccountDao> {
    private AccountDao accountDao;

    public AccountService() {
    }

    @Override
    protected AccountDao getBaseDao() {
        return this.accountDao;
    }

    @Override
    @Transactional
    public Account create(String name) {
        return this.accountDao.save(new Account(name));
    }

    @Inject
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
