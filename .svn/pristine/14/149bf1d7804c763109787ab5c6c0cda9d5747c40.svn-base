package com.jnit.session5.exceptionsfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//finally -> to perform resource cleanups(db connection, fli i/o connections etc..)
//try,catch() ->finally always gets executed
//try-catch
//try-multiple catches
//try-catch(one or me)-finally
//try with finally
public class FinallyMain {

	public static void main(String[] args) {
		getConnection();

	}

	private static void getConnection() {
		//Connection conn = null;
		//try with resources - Java 7,Closeable and AutoCloseable interfaces
		try(Connection conn = DriverManager.getConnection("")){
			//conn = DriverManager.getConnection("");
			//executing some query
			//conn.close();
		}catch(SQLException se){
			se.printStackTrace();
		}
	}

}
