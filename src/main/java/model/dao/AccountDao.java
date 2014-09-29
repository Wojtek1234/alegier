package model.dao;

import model.dao.base.BaseDao;
import model.entity.Account;

/**
 * Created by Wojtek on 2014-09-28.
 */
public class AccountDao extends BaseDao<Account> {
    public AccountDao(Class<Account> clazz) {
        super(clazz);
    }
}
