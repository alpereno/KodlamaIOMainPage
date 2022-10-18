package kodlamaiotempwebsite.dataAccess.jdbc;

import kodlamaiotempwebsite.dataAccess.CategoryDao;
import kodlamaiotempwebsite.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("Category has been added on JDBC");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Categor has been deleted on JDBC");
    }

    @Override
    public void update(Category category) {
        System.out.println("Category has been updated on JDBC");
    }
        
}
