package kodlamaiotempwebsite.dataAccess.jdbc;

import kodlamaiotempwebsite.dataAccess.EducatorDao;
import kodlamaiotempwebsite.entities.Educator;

public class JdbcEducatorDao implements EducatorDao{

    @Override
    public void add(Educator educator) {
        System.out.println("Educator has been added on JDBC");
    }

    @Override
    public void delete(Educator educator) {
        System.out.println("Educator has been deleted on JDBC");
    }

    @Override
    public void update(Educator educator) {
        System.out.println("Educator has been updated on JDBC");
    }
    
}
