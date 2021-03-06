package com.revature.battleship.pojos;

/*
 * Author: Shawn Barnes
 * Date: 7/7/17
 * File: OracleConnection.java
 * Purpose: Open and maintain "Connection" to the Oracle DB
 */

import java.sql.*;
import java.io.*;
import java.util.Properties;
public class OracleConnection {

	// static connection variable for singleton design pattern
	private static Connection conn;
	private String url;
	private String username;
	private String password;
	private String oracleClass;
	
	// private constructor for singleton design pattern
	private OracleConnection()
	{
		try{
			//create an instance of java.util.Properties class
			Properties prop = new Properties();
			
			//load the prop instance with the file
			prop.load(new FileReader(new File("connection.properties")));
			
			url = prop.getProperty("Url");
			username = prop.getProperty("Username");
			password = prop.getProperty("Password");
			oracleClass = prop.getProperty("OracleClass");
			//2 - Load Driver
			Class.forName(oracleClass);
			
			//3 - Get connection object;
			conn = DriverManager.getConnection(url, username, password);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// static method to create new connection using singleton design pattern
	public static Connection getOracleConnection()
	{
			// check to see if static variable conn has been initialized
			if(conn==null)
			{
				new OracleConnection();
			}
			return conn;
	}
}
