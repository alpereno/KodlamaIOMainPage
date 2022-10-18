package kodlamaiotempwebsite.business;

import java.util.ArrayList;
import kodlamaiotempwebsite.core.logging.Logger;
import kodlamaiotempwebsite.dataAccess.EducatorDao;
import kodlamaiotempwebsite.entities.Educator;

public class EducatorManager {
    private EducatorDao educatorDao;
    private ArrayList<Logger> loggers;
    private ArrayList<Educator> educators;
    
    public EducatorManager(EducatorDao educatorDao, ArrayList<Logger> loggers){
        this.educatorDao = educatorDao;
        this.loggers = loggers;
        educators = new ArrayList<>();
    }
    
    public void add(Educator newEducator){
        educators.add(newEducator);
        educatorDao.add(newEducator);
        
        for (Logger logger:loggers) {
            logger.log(newEducator.getFirstName()+"'s Data");
        }
    }
    
    public void update(Educator newEducator){
        educatorDao.update(newEducator);
        
//        for (Logger logger:loggers) {
//            logger.log(newEducator.getFirstName()+"'s Data");
//        }
    }
    
    public void delete(Educator newEducator){
        educators.remove(newEducator);
        educatorDao.delete(newEducator);
        
//        for (Logger logger:loggers) {
//            logger.log(newEducator.getFirstName()+"'s Data");
//        }
    }    
}
