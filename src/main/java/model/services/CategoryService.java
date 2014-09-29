package model.services;

import model.dao.CategoryDao;
import model.entity.Category;
import model.services.base.BaseService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by Wojtek on 2014-09-28.
 */
@Service
public class CategoryService extends BaseService<Category,CategoryDao> {
    private CategoryDao categoryDao;

    public CategoryService() {

    }

    @Override
    protected CategoryDao getBaseDao() {
        return categoryDao;
    }

    @Override
    public Category create(String name) {
        return  this.categoryDao.save(new Category(name));
    }
    @Inject
    public void setCategoryDao( CategoryDao categoryDao )
    {
        this.categoryDao = categoryDao;
    }

}
