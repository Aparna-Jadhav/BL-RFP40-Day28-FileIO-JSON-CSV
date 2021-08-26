package com.BL_FileHandling_JsonFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONExample 
{
	public static void main(String[] args) 
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("data.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray dataList = (JSONArray) obj;
            System.out.println(dataList);
             
            //Iterate over employee array
            dataList.forEach( data -> parseDataObject( (JSONObject) data ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseDataObject(JSONObject data) 
    {
        //Get data object within list
        JSONObject dataObject = (JSONObject) data.get("Data");
         
        //Get data first name
        String firstName = (String) dataObject.get("firstName");    
        System.out.println(firstName);
         
        //Get data last name
        String lastName = (String) dataObject.get("lastName");  
        System.out.println(lastName);
         
     
    }
}
