package kodlamaiotempwebsite;

import java.util.ArrayList;
import kodlamaiotempwebsite.business.CategoryManager;
import kodlamaiotempwebsite.business.CourseManager;
import kodlamaiotempwebsite.business.EducatorManager;
import kodlamaiotempwebsite.core.logging.DataBaseLogger;
import kodlamaiotempwebsite.core.logging.FileLogger;
import kodlamaiotempwebsite.core.logging.Logger;
import kodlamaiotempwebsite.core.logging.MailLogger;
import kodlamaiotempwebsite.dataAccess.hibernate.HibernateCategoryDao;
import kodlamaiotempwebsite.dataAccess.jdbc.JdbcCourseDao;
import kodlamaiotempwebsite.dataAccess.jdbc.JdbcEducatorDao;
import kodlamaiotempwebsite.entities.Category;
import kodlamaiotempwebsite.entities.Course;
import kodlamaiotempwebsite.entities.Educator;

/**
 *
 * @author alper
 */
public class KodlamaIOTempWebSite {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ArrayList<Logger> loggers = new ArrayList<>();
        loggers.add(new FileLogger());
        loggers.add(new DataBaseLogger());
        loggers.add(new MailLogger());
        
        EducatorManager educatorManager = new EducatorManager(new JdbcEducatorDao(), loggers);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        
        Category gameDevelopment = new Category("Game Development");
        Educator sebastian = new Educator("Sebastian", "Lague");
        Course unityAdvanced = new Course("Unity Advance", "Advance Unity Tutorial", 50f, sebastian, gameDevelopment);
        Course unityIntermediate = new Course("Unity Intermediate", "Intermediate Unity Scripting Tutorial", 50f, sebastian, gameDevelopment);
        Category webDevelopment = new Category("web dev");
        Course angular = new Course("angular first", "angular One", 50f, sebastian, webDevelopment);
        
        
        educatorManager.add(sebastian);
        System.out.println("---------------");
        categoryManager.add(webDevelopment);
        System.out.println(" ");
        categoryManager.add(gameDevelopment);
        System.out.println("--------------");
        courseManager.add(angular);
        System.out.println(" ");
        courseManager.add(unityAdvanced);
        System.out.println(" ");
        courseManager.add(unityIntermediate);
              
        
    }    
}
