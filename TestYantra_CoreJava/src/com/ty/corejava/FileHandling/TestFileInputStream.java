package com.ty.corejava.FileHandling;

import java.io.FileInputStream;

public class TestFileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream f1=new FileInputStream("Avi.txt")) {
			
			int i=0;
			while((i=f1.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
