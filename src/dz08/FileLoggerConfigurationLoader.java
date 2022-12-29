package dz08;
import org.json.simple.JSONObject;
import  org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;

public class FileLoggerConfigurationLoader {
    public void FileConfiguration() throws IOException, ParseException {
        FileLoggerConfiguration fileLoggerConfiguration =new FileLoggerConfiguration();
        JSONParser jsonparser = new JSONParser();
        try {
            Object obj = jsonparser.parse(new FileReader("/home/igor/IdeaProjects/Curs_Java_Pro/src/dz08/Configuration.json"));
            JSONObject jsonObject=(JSONObject) obj;
            String format= (String) jsonObject.get("FORMAT");
            fileLoggerConfiguration.setFormat(format);
            String file= (String) jsonObject.get("FILE");
            fileLoggerConfiguration.setName(file);
            String patch= (String) jsonObject.get("PATCH");
            fileLoggerConfiguration.setPatch(patch);
            String level= (String) jsonObject.get("LEVEL");
            fileLoggerConfiguration.setLevel(level);
            long maxsize= (long) jsonObject.get("MAX-SIZE");
            fileLoggerConfiguration.setMaxsize(maxsize);
        } catch (Exception e){
        }
    }
}