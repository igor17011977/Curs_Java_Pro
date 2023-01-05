package dz08;

import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    long size;

    public static class MaxSizeCheck {
        public void maxSize(long size, long maxsize) throws FileMaxSizeReachedException {
            if (size > maxsize)
                throw new FileMaxSizeReachedException("File is to big, create new file");
        }
    }

    public static void main(String[] args) throws IOException, ParseException {
        FileLoggerConfigurationLoader fileLoggerConfigurationLoader=new FileLoggerConfigurationLoader();
        fileLoggerConfigurationLoader.FileConfiguration();
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy-HH:mm");
        File file = new File(fileLoggerConfiguration.getPatch()+fileLoggerConfiguration.getName()+"."+fileLoggerConfiguration.getFormat());

        for (int i = 0; i < 3; i++) {
            MaxSizeCheck maxSizeCheck = new MaxSizeCheck();
            try {
                maxSizeCheck.maxSize(file.length(), fileLoggerConfiguration.getMaxsize());
            } catch (FileMaxSizeReachedException e) {
                System.err.println(e);
                System.err.println("Max size file= " + fileLoggerConfiguration.getMaxsize());
                System.err.println("Current size file= " + file.length());
                System.err.println("Current patch to file = " + file);
                fileLoggerConfiguration.setName("Log_" + simpleDateFormat.format(new Date()));
                file = new File(fileLoggerConfiguration.getPatch()+fileLoggerConfiguration.getName()+"."+fileLoggerConfiguration.getFormat());
            }

            FileLogger fileLogger = new FileLogger();
            if (fileLoggerConfiguration.getLevel().equals("DEBUG")) {
                fileLogger.writeLog(FileLogger.Log.DEBUG, fileLoggerConfiguration.getPatch()+fileLoggerConfiguration.getName()+"."+fileLoggerConfiguration.getFormat());
            } else if (fileLoggerConfiguration.getLevel().equals("INFO")){
                fileLogger.writeLog(FileLogger.Log.INFO, fileLoggerConfiguration.getPatch()+fileLoggerConfiguration.getName()+"."+fileLoggerConfiguration.getFormat());
            }
        }
    }
}





