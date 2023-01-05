package dz08;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger {
    public enum Log{
        INFO,
        DEBUG
    }
    public void writeLog(Log log,String patch) {

        switch (log) {
            case DEBUG:
                debug(patch);
                info(patch);
                break;
            case INFO:
                info(patch);
                break;
        }
    }
    public void debug(String file){

        try (FileWriter fileWriter = new FileWriter(file, true)) {
             fileWriter.write("["+LocalDateTime.now().withNano(0)+"][DEBUG] Message: [This is debag message]" + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public void info(String file){
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("["+LocalDateTime.now().withNano(0)+"][INFO] Message: [This is info message]" + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

