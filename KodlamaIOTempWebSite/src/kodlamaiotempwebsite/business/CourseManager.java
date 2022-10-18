package kodlamaiotempwebsite.business;

import java.util.ArrayList;
import kodlamaiotempwebsite.core.logging.Logger;
import kodlamaiotempwebsite.dataAccess.CourseDao;
import kodlamaiotempwebsite.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private ArrayList<Logger> loggers;
    private ArrayList<Course> courses;

    public CourseManager(CourseDao courseDao, ArrayList<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        courses = new ArrayList<Course>();
    }
    
    public void add(Course newCourse) throws Exception{
        if (newCourse.getPrice() < 0) {
            throw new Exception("Course price is cannot less then 0");
        }
        
        for (Course course:courses) {
            if (newCourse.getName() == course.getName()) {
                throw new Exception("Course name(s) are cannot be the same");
            }
        }
        
        courses.add(newCourse);
        courseDao.add(newCourse);
        newCourse.getEducator().getCourses().add(newCourse);
        newCourse.getCategory().getCourses().add(newCourse);
        
        for (Logger logger:loggers) {
            logger.log(newCourse.getName() + "'s Data");
        }
        
    }
    
    public void delete(Course newCourse){
        if (courses.contains(newCourse)) {            
            courses.remove(newCourse);
            courseDao.delete(newCourse);  
        }
    }
    
    public void update(Course newCourse){
        courseDao.update(newCourse);
    }
}
