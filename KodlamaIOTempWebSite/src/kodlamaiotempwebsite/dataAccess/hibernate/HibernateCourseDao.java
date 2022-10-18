package kodlamaiotempwebsite.dataAccess.hibernate;

import kodlamaiotempwebsite.dataAccess.CourseDao;
import kodlamaiotempwebsite.entities.Course;

public class HibernateCourseDao implements CourseDao{
    
    @Override
    public void add(Course course) {
        System.out.println("Course has been added on Hibernate");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Course has been deleted on Hibernate");
    }

    @Override
    public void update(Course course) {
        System.out.println("Course has been updated on Hibernate");
    }
}
