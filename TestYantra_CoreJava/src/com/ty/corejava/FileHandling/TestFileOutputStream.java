package com.ty.corejava.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileOutputStream fs=new FileOutputStream("Avi.txt"))  // try with resource
		{
			String msg="Hello,Good Morning...";
			
			byte b[]=msg.getBytes();
			
			fs.write(b);
			System.out.println("File created successfully..");
		}
		catch ( IOException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
