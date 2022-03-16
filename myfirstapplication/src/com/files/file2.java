package com.files;
import java.util.*;
import java.io.*;
public class file2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:\\Users\\2075942\\test.txt",true);
		
		System.out.println("Enter some Text");
		String str = sc.nextLine();
		str = "\n"+str;
		byte[] arr = str.getBytes();
		fw.write(str);
		fw.close();
		System.out.println("File is created....");

	}

}
