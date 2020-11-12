package com.ty.csvReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class CsvReader 
{
    public static void main( String[] args )
    {
       try(FileReader fr=new FileReader("SampleCSVFile_2kb.csv")){
    	   CSVReader csvReader = new CSVReader(fr); 
           String[] nextRecord; 
        // we are going to read data line by line 
           while ((nextRecord = csvReader.readNext()) != null) { 
               for (String cell : nextRecord) { 
                   System.out.print(cell + "\t"); 
               } 
               System.out.println(); 
           } 
           
           /*
            TYPE-2
            List<String[]> allData = csvReader.readAll(); 
           		// print Data 
		           	for (String[] row : allData) { 
		               for (String cell : row) { 
		                   System.out.print(cell + "\t"); 
		               } 
		               System.out.println(); 
		             }  
            */
       }
       catch (IOException e) {
		System.out.println("File Error "+e);
	}
    }
}
