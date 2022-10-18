package kodlamaiotempwebsite.dataAccess.hibernate;

import kodlamaiotempwebsite.dataAccess.EducatorDao;
import kodlamaiotempwebsite.entities.Educator;

public class HibernateEducatorDao implements EducatorDao{
    @Override
    public void add(Educator course) {
        System.out.println("Course has been added on Hibernate");
    }

    @Override
    public void delete(Educator course) {
        System.out.println("Course has been deleted on Hibernate");
    }

    @Override
    public void update(Educator course) {
        System.out.println("Course has been updated on Hibernate");
    }
}
