package jena;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public static Connection getConnection(){
		Connection cnn = null;
			try{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tebd?useSSL=false","root","1234");
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
			
			return cnn;
	}
}
