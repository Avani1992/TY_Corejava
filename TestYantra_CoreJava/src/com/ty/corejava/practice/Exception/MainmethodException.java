package com.ty.corejava.practice.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainmethodException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fs=new FileInputStream("Text.txt");
		
		int i=0;
		while((i=fs.read())!=-1) {
			System.out.println((char)i);
		}

	}

}
