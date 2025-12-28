package com.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileDemo {

	public static void main(String[] args) {

		File file = new File("mytext.txt");
		FileWriter fw = null;
		
		File file1 = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\java\\MyCoreJavaPrograms\\src\\com\\files\\MyInfoFile.txt");
		FileWriter fWriter = null;
		try {
			 fw = new FileWriter(file);
			fw.write("Hello Ajju from text file");
			fWriter = new FileWriter(file1);
			fWriter.write("hello From AJay--- From File New Created");
			fWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//read
		FileReader fr=null;
		try {
		fr = new FileReader("C:\\Users\\Ajay\\OneDrive\\Desktop\\java\\MyCoreJavaPrograms\\src\\com\\files\\MyInfoFile.txt");
		int data = fr.read();
		Scanner sc = new Scanner(System.in);
		
		
		while(data != -1) {
			System.out.print((char)data);
			data = fr.read();
		}
		
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		finally {
			try {
				fw.close();
				fWriter.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
