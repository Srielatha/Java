package com.jnit.session5.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//CheckedExceptions -> IoException and its children(FileNotFound)
//as a programmeer we can recover from the exception
//try/catch is ur exception handler
//throw and throws
//ui(handle -> response()),service,dao
//altering size of arrays.aslist
//finally,custom exception creations, exceptions in inheritance,system.exit and return
//Classnotfoundexception vs nocalldeffounderror
//static = new Employee();
//dyanamic =  Class.forName("org.jnit.Employee");
public class CheckedExceptionsMain {
	
	static{
		try{
			test("bello");
		}catch(RuntimeException re){
			re.printStackTrace();
		}
	}
	{
		test("bello");
	}
	
	public static void main(String[] args){
		new CheckedExceptionsMain();
		try {
			m1();
			
		}
		catch (FileNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		//test("hello");
		try {
			teste("hello");
		} catch (Exception e) {			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//throw -> inside method body,throw both checked and unchecked, 
	//throws -> method signature-> checked 
	public static void test(String s) throws RuntimeException{
		if(!s.startsWith("hello")){
			//throw new IllegalArgumentException("Expecting string to start with hello");
			throw new RuntimeException("Expecting string to start with hello");
			//System.out.println("hello");
		}
		///do some logic
	}
	//throws -> Exception and all of its children other than RunTimeException and its children
	public static void teste(String s) throws Exception{
		if(!s.startsWith("hello")){
			throw new Exception("Expecting string to start with hello");
		}
		///do some logic
	}
	public static void m1() throws FileNotFoundException, SQLException {
		readFileAndWriteitoDb();
		System.out.println("hello");
	}

	private static void readFileAndWriteitoDb() throws SQLException, FileNotFoundException {

		FileReader reader = new FileReader(new File("abc.txt"));
		Connection conn = DriverManager.getConnection("");
		//custom logic to read and write the data to db
		//System.out.println(e.getMessage());
		// e.printStackTrace();
	}

}
