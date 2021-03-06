package com.jcg;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
/**
 * @author ashraf_sarhan
 *
 */
public class CsvFileReader {
     
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
     
    //Data attributes index

    private static final int DATA_FNAME_IDX = 0;
    private static final int DATA_LNAME_IDX = 1;
    
     
    public static void readCsvFile(String fileName) {
 
        BufferedReader fileReader = null;
      
        try {
             
            //Create a new list of student to be filled by CSV file data 
            List students = new ArrayList();
             
            String line = "";
             
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileName));
             
            //Read the CSV file header to skip it
            fileReader.readLine();
             
            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                    //Create a new student object and fill his  data
                	CSVUser data = new CSVUser(tokens[STUDENT_FNAME_IDX], tokens[STUDENT_LNAME_IDX]);
                    students.add(student);
                }
            }
             
            //Print the new student list
            for (Student student : students) {
                System.out.println(student.toString());
            }
        } 
        catch (Exception e) {
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }
 
    }
 
}