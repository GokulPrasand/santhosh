package com.files;
import java.util.*;
import java.io.*;
public class file1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\2075942\\javafilesdemo.txt");
		System.out.println("Enter some Text");
		String str = sc.nextLine();
		byte[] arr = str.getBytes();
		fos.write(arr);
		fos.close();
		System.out.println("File is created....");

	}

}
