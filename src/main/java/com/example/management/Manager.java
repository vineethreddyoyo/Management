package com.example.management;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Manager implements Serializable {

	@Id
	@Column(name ="manager_id")
	private Long managerId;
	
	@Column(name = "manager_name")
	private String managerName;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@OneToOne
	@JoinColumn(name="hotel_id")
	private Hotel hotel;

	

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Manager(Long manager_id, String name, String username, String password) {
		super();
		this.managerId = manager_id;
		this.managerName = name;
		this.username = username;
		this.password = password;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
