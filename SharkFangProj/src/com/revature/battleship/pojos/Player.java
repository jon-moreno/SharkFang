package com.revature.battleship.pojos;

import java.util.*;

public class Player 
{
	private int uid;
	private String uname;
	private String pword;
	private String email;
	private String fname;
	private String lname;
	private String profPic;
	private ArrayList<Integer> highScores = new ArrayList<Integer>();


	public Player()
	{
		
	}
	
	public Player(int uid, String uname, String pword, String email, String fname, String lname, String profPic) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.pword = pword;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.profPic = profPic;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getProfPic() {
		return profPic;
	}
	public void setProfPic(String profPic) {
		this.profPic = profPic;
	}
	
	public ArrayList<Integer> getHighScores() {
		return highScores;
	}

	public void setHighScores(ArrayList<Integer> highScores) {
		this.highScores = highScores;
	}
	
}
