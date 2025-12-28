package com.fileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FileOperationMain {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Java File Operations\\FirstFile.text");
//		try {
//			if(file.createNewFile()) {
//				System.out.println("File Created");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		file2.createNewFile();
		
		FileInputStream fsr = new FileInputStream(file);
		int index;
		String text = new String();
		while((index = fsr.read()) != -1) {
			text += (char)index;
		}
		System.out.println(text);
		
		fsr.close();
		//Using Scanner Class Reading Text from Text File
		File file2 = new File("mytext.txt");
		Scanner scanner = new Scanner(file2);
		while(scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
		
		FileReader fr = new FileReader(file2);
		
		
		//BufferedReader
		BufferedReader bfr = new BufferedReader(fr);
		int Index ;
		String sentenance = new String();
		while((Index = bfr.read())!=-1) {
			sentenance += (char)Index;
		}
		System.out.println(sentenance);
		
		BufferedReader bfr2 = new BufferedReader(new FileReader(file));
		String str;
		String sent = "";
		while((str =  bfr2.readLine()) != null) {
			sent += str+ "\n";
		}
		
		System.out.println("ReadLine "+ sent);
		fr.close();
		bfr.close();
		
		//FileReader
		FileReader fr2 = new FileReader(file);
		int indexx;
		while((indexx = fr2.read()) !=-1) {
			System.out.print((char)indexx);
		}
		
		
		fr2.close();
		
		FileOutputStream fos = new FileOutputStream(file2);
		fos.write(45);
		fos.write(56);
		
	fos.close();
	FileWriter fw = new FileWriter(file2);
	fw.write("Hello Iam From Leicester UK@#");
	fw.close();
	}

}
