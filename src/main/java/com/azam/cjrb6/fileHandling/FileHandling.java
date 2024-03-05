package com.azam.cjrb6.fileHandling;

import java.io.File;

public class FileHandling {
	public static void main(String[] args) {
//		File file = new File("C://azam");
//		file.mkdir();//create directory or folder
//		System.out.println("azam folder has been created");
		
//		File file = new File("C://azam/test.txt");
//		try {
//			file.createNewFile();//create a new file
//			System.out.println("File created successfully");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		try {
//			FileWriter writer = new FileWriter("C://azam/test.txt");
//			writer.write("This is last class of java");//Assignment, write multiple lines 
//			writer.flush();
//			System.out.println("Writing operation is done");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		try {
//			FileReader reader = new FileReader("C://azam/test.txt");
//			BufferedReader br = new BufferedReader(reader);
//			String line = br.readLine();//Assignment read multiple line
//			System.out.println(line);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		File file = new File("C://azam/test.txt");
		file.delete();
		System.out.println("test.txt is deleted");
	}
}
