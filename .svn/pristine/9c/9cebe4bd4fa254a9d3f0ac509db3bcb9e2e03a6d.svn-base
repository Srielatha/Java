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
public class ThrowMain {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader(new File("abc.txt"));
			Connection conn = DriverManager.getConnection("");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
			try {
				FileReader reader = new FileReader(new File("bbc.txt"));
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			
		}catch(SQLException se){
			
		}
		
		System.out.println("My program finished");
	}

}
