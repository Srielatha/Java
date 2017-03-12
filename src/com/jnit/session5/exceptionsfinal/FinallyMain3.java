package com.jnit.session5.exceptionsfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyMain3 {

	public static void main(String[] args) {
		try {
			main();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Exception handled");
		}
	}
	
	public static int main() throws Exception {
		Connection conn = null;
		int x = 10;
		try{
			conn = DriverManager.getConnection("");
			//executing some query
			//conn.close();
		}catch(SQLException se){
			System.out.println("catch 1");
			//System.exit(0);
			return x;
			//throw new Exception("cactch sql");
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
			//throw new Exception("finally");

		}
		return x;

	}


}
