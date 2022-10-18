package kodlamaiotempwebsite.core.logging;

public class DataBaseLogger implements Logger{

    @Override
    public void log(String logMessage) {
        System.out.println("log to DataBase = " + logMessage);
    }    
}
