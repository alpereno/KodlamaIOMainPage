package kodlamaiotempwebsite.business;

import java.util.ArrayList;
import kodlamaiotempwebsite.core.logging.Logger;
import kodlamaiotempwebsite.dataAccess.CategoryDao;
import kodlamaiotempwebsite.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private ArrayList<Logger> loggers;
    private ArrayList<Category> categories;

    public CategoryManager(CategoryDao categoryDao, ArrayList<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        categories = new ArrayList<Category>();
    }
    
    public void add(Category newCategory) throws Exception{
        for(Category category:categories){
            if (newCategory.getName() == category.getName()) {
                throw new Exception("Category name's cannot be the same");
            }
        }
        
        categories.add(newCategory);
        categoryDao.add(newCategory);
        
        for(Logger logger:loggers){
            logger.log(newCategory.getName() + "'s Data");
        }
    }

    public void delete(Category newCategory){
        if (categories.contains(newCategory)) {
            categories.remove(newCategory);
            categoryDao.delete(newCategory);
        }
    }
    
    public void update(Category newCategory){
        categoryDao.update(newCategory);
    }
}
