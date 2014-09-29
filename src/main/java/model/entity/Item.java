package model.entity;


import model.entity.base.BaseEntity;

import javax.persistence.*;
import javax.swing.*;
import java.sql.Date;

/**
 * Created by Wojtek on 2014-09-21.
 */

@Entity
@Table( name = "item" )
@SequenceGenerator( name = "seq", sequenceName = "seq_item" )
@AttributeOverrides( { @AttributeOverride( name = "id", column = @Column( name = "item_id" ) )})
public class Item extends BaseEntity{

    @ManyToOne( targetEntity = Account.class, cascade = CascadeType.MERGE)
    @JoinColumn( name = "item_account_id" )
    private Account account;

    @ManyToOne( targetEntity = Category.class )
    @JoinColumn( name = "item_category_id" )
    private Category category;


    private Date  experiedDate;

    private String name;


    private double currentPrice;
    private ImageIcon imageIcon;


    public Item(){

    }

    public Item(String name, Account account, Category category,Date exeriedDate,ImageIcon image){
        this.name=name;
        this.account=account;
        this.category=category;
        this.experiedDate=exeriedDate;
        this.imageIcon=image;
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

    public Date getExperiedDate() {
        return experiedDate;
    }

    public void setExperiedDate(Date experiedDate) {
        this.experiedDate = experiedDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }


    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }
}