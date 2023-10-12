package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1. load driver (optional)
			//2. establish connection
			String url= "jdbc:mysql://localhost:3306/";
			String username="root";
			String password= "root";
			
			Connection conn=DriverManager.getConnection(url, username, password);
			//3. create statement
			Statement stm= conn.createStatement();
			//4. execute query
			String query= "create database ForJDBC";
			stm.execute(query);
			
			System.out.println("Database created  Successfully");
			//5. close connection
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
