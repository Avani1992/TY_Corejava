package com.tyss.designpattern;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.tyss.designpattern.dto.Person;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {

		Test t1=new Test();
		Person p = t1.getPersonDetailById(101);
		System.out.println("Id= "+p.getPid());
		System.out.println("Name= "+p.getName());
		System.out.println("EmailId= "+p.getEmailId());
		System.out.println("=========================");
	}

}

