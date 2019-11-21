package com.thealth.DAO.Auth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.thealth.DAO.OpenConnection;
import com.thealth.Model.Users;

public class loginVerify {
	
	// to  get an object of data resource
	OpenConnection connection=null;
	// connection object
	Connection con;
	String sql="select username,password from users where username=? and password=?";
	String sql1="select userid from users where username=?";
	String sql2="select userid from nurse where userid=?";
	private int id=0;
	
	public int getId() {
		
		return this.id;
	}
	public loginVerify() {
		
		this.connection=OpenConnection.getInstance();
	}
	
	
	public int getUserid(String username) {
		
		
		try {
			con=connection.getResource().getConnection();
			
			PreparedStatement stmt=con.prepareStatement(sql1);
			stmt.setString(1, username);
			
			
			ResultSet rs=stmt.executeQuery();
			if(rs.next()) {
				
				
			int uid=rs.getInt("userid");
			return uid;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return -1;
	}
	public String check(Users users) {
		String user="not a user";
		String password=users.getPassword(); 
		String username=users.getUsername();
		try {
			con=connection.getResource().getConnection();
			
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1, username);
			stmt.setString(2, password);
			
			ResultSet rs=stmt.executeQuery();
			if(rs.next()) {
				
				
				String uname=rs.getString("username");
				
			 this.id=getUserid(uname);
			
			if(id!=-1) {
				
				 user=getUser(id);
				return user;
			}
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	
	
	public String getUser(int userid) {
		String  user="not a user";
		try {
			con=connection.getResource().getConnection();
			
			PreparedStatement stmt=con.prepareStatement(sql2);
			stmt.setInt(1, userid);
			
			
			ResultSet rs=stmt.executeQuery();
			if(rs.next()) {
				
				
				  user="Nurse";
			
			}
			else user="Patient";
			
			return user;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	
	
	
	
	
	
	
	

}
