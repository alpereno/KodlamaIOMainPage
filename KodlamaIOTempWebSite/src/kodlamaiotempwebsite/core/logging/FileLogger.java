package kodlamaiotempwebsite.core.logging;

public class FileLogger implements Logger{

    @Override
    public void log(String logMessage) {
        System.out.println("log to File = " + logMessage);
    }    
}
