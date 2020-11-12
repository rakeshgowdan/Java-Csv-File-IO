package com.ty.csvWriter;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class CsvWriterAppend {
	public static void main(String[] args) {
		
	
	try( FileWriter out = new FileWriter("sample.csv",true);
 		   CSVWriter writer = new CSVWriter(out);){
 	    
        String[] appendData = { "mohan", "21", "830" }; 
        writer.writeNext(appendData); 
        
        System.out.println("csv Appending done");
 	   
    } catch (IOException e) {
		System.out.println("File Error");
	}
 }
}
