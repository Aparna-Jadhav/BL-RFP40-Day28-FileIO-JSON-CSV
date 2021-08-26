package com.BL_FileHandling_CsvFile;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CsvFileWriter 
{
	//Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
     
    //CSV file header
    private static final String FILE_HEADER = "firstName,lastName";
 
    public static void writeCsvFile(String fileName) 
    {
         
        //Create new students objects
        Student student1 = new Student("Aparna", "Jadhav");
        Student student2 = new Student("Abhi", "Jadhav");
        Student student3 = new Student("Anjali", "Jadhav");
        Student student4 = new Student("Anu", "Jadhav");
        Student student5 = new Student("Rahul", "Jadhav");
        Student student6 = new Student("Ajay", "Jadhav");
         
        //Create a new list of student objects
        ArrayList students = new ArrayList();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
         
        FileWriter fileWriter = null;
                 
        try {
            fileWriter = new FileWriter(fileName);
 
            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());
             
            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);
             
            //Write a new student object list to the CSV file
            for (Student student : students) {
                
                fileWriter.append(student.getFirstName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getLastName());
                fileWriter.append(COMMA_DELIMITER);
                
            }
 
             
             
            System.out.println("CSV file was created successfully !!!");
             
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
             
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
             
        }
    }

}
