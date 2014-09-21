package model.entity;


import model.entity.base.BaseEntity;

import java.util.Date;

/**
 * Created by Wojtek on 2014-09-21.
 */
public class Item extends BaseEntity{


    private Date  experiedDate;
    private  Category category;
    private String name;
    private Account account;

    public Item(){

    }

    public Item(String name, Account account, Category category,Date exeriedDate){
        this.name=name;
        this.account=account;
        this.category=category;
        this.experiedDate=exeriedDate;
    }

    public final Account getAccount()
    {
        return this.account;
    }

    public final void setAccount( Account account )
    {
        this.account = account;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }
}