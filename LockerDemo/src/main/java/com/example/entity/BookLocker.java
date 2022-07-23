package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookLocker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private int userId;
	private int lockerId;
	private String userName;
	private String userPassword;
	public int getUserId() {
		return userId;
	}
	
	
	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getLockerId() {
		return lockerId;
	}
	public void setLockerId(int lockerId) {
		this.lockerId = lockerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public BookLocker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookLocker(int userId, int lockerId, String userName, String userPassword) {
		super();
		this.userId = userId;
		this.lockerId = lockerId;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	

}
