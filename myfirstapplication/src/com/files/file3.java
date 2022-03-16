package com.files;
import java.util.*;
import java.io.*;
public class file3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileInputStream fis = new FileInputStream("C:\\Users\\2075942\\javafilesdemo.txt");
		int ch = fis.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch = fis.read();
		}
	      fis.close();	
	}

}
