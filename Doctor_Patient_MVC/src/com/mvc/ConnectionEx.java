package com.mvc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionEx {
	public static Connection connectivity() throws ClassNotFoundException,SQLException{
         Class.forName("com.mysql.jdbc.Driver");
         String url="jdbc:mysql://localhost:3306/kims";
         String username="root";
         String password="akshay123";
         Connection con=(Connection) DriverManager.getConnection(url,username,password);
         return con; 
	}  
}
