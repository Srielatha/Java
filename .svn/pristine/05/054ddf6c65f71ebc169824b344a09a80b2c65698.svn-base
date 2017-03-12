package com.jnit.session5.exceptionsfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyMain2 {
	public static void main(String[] args) {
		try {
			main();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception handled");
		}
	}
	
	public static void main() throws Exception {
		Connection conn = null;
		try{
			conn = DriverManager.getConnection("");
			//executing some query
			//conn.close();
		}catch(SQLException se){
			throw new Exception(se.getMessage());
		}
		finally{
			System.out.println("hello");
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
