package model.dao;

import model.dao.base.BaseDao;
import model.entity.Category;

/**
 * Created by Wojtek on 2014-09-28.
 */
public class CategoryDao extends BaseDao<Category> {
    public CategoryDao(Class<Category> clazz)
    {
        super( clazz );
    }
}
