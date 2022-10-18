package kodlamaiotempwebsite.dataAccess.hibernate;

import kodlamaiotempwebsite.dataAccess.CategoryDao;
import kodlamaiotempwebsite.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("Category has been added on Hibernate");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Categor has been deleted on Hibernate");
    }

    @Override
    public void update(Category category) {
        System.out.println("Category has been updated on Hibernate");
    }
    
}
