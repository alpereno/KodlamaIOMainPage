package kodlamaiotempwebsite.dataAccess.jdbc;

import kodlamaiotempwebsite.dataAccess.CourseDao;
import kodlamaiotempwebsite.entities.Course;

public class JdbcCourseDao implements CourseDao{

    @Override
    public void add(Course course) {
        System.out.println("Course has been added on JDBC");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Course has been deleted on JDBC");
    }

    @Override
    public void update(Course course) {
        System.out.println("Course has been updated on JDBC");
    }
    
}
