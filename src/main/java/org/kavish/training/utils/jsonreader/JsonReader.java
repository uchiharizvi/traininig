package org.kavish.training.utils.jsonreader;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {

//    public static <T> T jsonToObject(String filePath, Class<T> clazz) {
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            return mapper.readValue(new File(filePath), clazz);
//        } catch (IOException ioe) {
//            System.out.println("an error occurred while reading or mapping JSON: " + ioe.getMessage());
//            ioe.printStackTrace();
//        } catch (DatabindException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static JSONObject readData(String fileName) {
        JSONObject jsonObject = new JSONObject();
        try {
            //read from file
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            //parse into JSON
            jsonObject = new JSONObject(content);
            //Iterate data
//            array = jsonObject.getJSONArray(root);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
