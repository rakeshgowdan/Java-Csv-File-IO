package com.ty.csvWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CsvWriterDiff {

	public static void main(String[] args) {
		
		try(
				FileWriter fr=new FileWriter("diffCsv.csv");
				CSVWriter writer = new CSVWriter(fr, '|', 
                        CSVWriter.NO_QUOTE_CHARACTER, 
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER, 
                        CSVWriter.DEFAULT_LINE_END); 
				){
		
			 // create a List which contains String array 
	        List<String[]> data = new ArrayList<String[]>(); 
	        data.add(new String[] { "Name", "Class", "Marks" }); 
	        data.add(new String[] { "Aman", "10", "620" }); 
	        data.add(new String[] { "Suraj", "10", "630" }); 
	        writer.writeAll(data); 
	        System.out.println("done");
	  
		}
		catch (IOException e) {
			System.out.println("File Error");
		}
	}
}
