package com.BL_FileHandling_JsonFile;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class WriteJSONExample 
{
    public static void main( String[] args )
    {
    	    //First Data
            JSONObject DataDetails = new JSONObject();
            DataDetails.put("firstName", "Aparna");
            DataDetails.put("lastName", "Jadhav");
            
             
            JSONObject dataObject = new JSONObject(); 
            dataObject.put("First data", DataDetails);
             
            //Second Data
            JSONObject DataDetails2 = new JSONObject();
            DataDetails2.put("firstName", "Abhi");
            DataDetails2.put("lastName", "Jadhav");
            
             
            JSONObject dataObject2 = new JSONObject(); 
            dataObject2.put("Second Data", DataDetails2);
             
            //Add data to list
            JSONArray dataList = new JSONArray();
            dataList.add(dataObject);
            dataList.add(dataObject2);
             
            //Write JSON file
            try (FileWriter file = new FileWriter("data.json")) {
                //We can write any JSONArray or JSONObject instance to the file
                file.write(dataList.toJSONString()); 
                file.close();
     
            } catch (IOException e) {
                e.printStackTrace();
            
            }
    }
}
