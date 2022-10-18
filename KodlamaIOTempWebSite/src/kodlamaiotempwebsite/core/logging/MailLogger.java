package kodlamaiotempwebsite.core.logging;

public class MailLogger implements Logger{

    @Override
    public void log(String logMessage) {
        System.out.println("log to Mail = " +logMessage);
    }    
}
