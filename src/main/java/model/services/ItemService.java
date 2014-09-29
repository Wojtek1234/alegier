package model.services;

import model.dao.ItemDao;
import model.entity.Account;
import model.entity.Category;
import model.entity.Item;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.swing.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Wojtek on 2014-09-28.
 */
@Service
public class ItemService {
    private ItemDao itemDao;


    @Transactional
    public Item create( String name, Account account,  Category category, Date data,ImageIcon imageIcon)
    {
        return itemDao.save( new Item(name, account, category, data ,imageIcon) );
    }

    public List<Item> getAll()
    {
        return this.itemDao.getAll();
    }

    public Item getById( Long id )
    {
        return (Item) this.itemDao.getById( id );
    }

    @Transactional
    public void removeById( long id )
    {
        this.itemDao.removeById( id );
    }

    @Transactional
    public void remove( Item item )
    {
        this.itemDao.remove( item );
    }

    @Inject
    public void setItemDao( ItemDao itemDao  )
    {
        this.itemDao = itemDao;
    }

    @Transactional
    public void refresh( List<Item> entityList )
    {
        for( Item entity : entityList )
        {
            this.itemDao.update( entity );
        }

        final List<Item> dbEntityList = this.itemDao.getAll();
        for( Item dbEntity : dbEntityList )
        {
            if( !entityList.contains( dbEntity ) )
            {
                this.itemDao.remove(dbEntity);
            }
        }
    }
}

