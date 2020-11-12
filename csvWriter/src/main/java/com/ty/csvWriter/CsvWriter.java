package com.ty.csvWriter;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class CsvWriter 
{
    public static void main( String[] args )
    {
       try( FileWriter out = new FileWriter("sample.csv",true);
    		   CSVWriter writer = new CSVWriter(out);){
    	   
    	// adding header to csv 
           String[] header = { "Name", "Class", "Marks" }; 
           writer.writeNext(header); 
        // add data to csv 
           String[] data1 = { "Aman", "10", "620" }; 
           writer.writeNext(data1); 
           String[] data2 = { "Suraj", "10", "630" }; 
           writer.writeNext(data2); 
           String[] data3 = { "Rakesh", "10", "630" }; 
           writer.writeNext(data3); 
           	/*
		        // create a List which contains String array 
		        List<String[]> data = new ArrayList<String[]>(); 
		        data.add(new String[] { "Name", "Class", "Marks" }); 
		        data.add(new String[] { "Aman", "10", "620" }); 
		        data.add(new String[] { "Suraj", "10", "630" }); 
		        writer.writeAll(data); 
           	 */
           System.out.println("csv writing done");
    	   
       } catch (IOException e) {
		System.out.println("File Error");
	}
    }
}
