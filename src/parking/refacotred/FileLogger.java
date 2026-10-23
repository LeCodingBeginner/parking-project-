package parking.refacotred;

public class FileLogger implements LoggerMethod{
    private String filename;

    public FileLogger(String filename){
        this.filename = filename;
    }

    public void log(String line) {
        System.out.println("Logged successfully in : " + filename);
    }
}
