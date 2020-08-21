package com.ty.corejava.practice1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class TestFileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileOutputStream fs=new FileOutputStream("data.txt"); FileInputStream fi=new FileInputStream("data.txt"); FileWriter fw=new FileWriter("data.txt",true); FileReader fr=new FileReader("data.txt"))
		{
			String s="Hello...GoodMorning...";
			byte b[]=s.getBytes();
			fs.write(b);
			System.out.println("file written successfully...");
			
			System.out.print("file data= ");
			int i=0;
			while((i=fi.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
			
			
			System.out.println("Update file using FileWriter ");
			
			fw.write("How r u??");
			
			System.out.println("Data updated successfully...");
			
			System.out.print("Updated data= ");
			int j;
			while((j=fr.read())!=-1)
			{
				System.out.print((char)j);
			}
			System.out.println();
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
