package com.project3.revtech.pojo;

public class UserPojo {

	 private int user_id;
	 private String firstName;
	 private String lastName;
     private String username;
     private String email;
     private String password;
	 private String address;
	 private String contact;
	// private String imageUrl;
	 
	public UserPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserPojo(int user_id, String firstName, String lastName, String username, String email, String password,
			String address, String contact) {
		super();
		this.user_id = user_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.password = password;
		this.address = address;
		this.contact = contact;
		//this.imageUrl = imageUrl;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}	
//	public String getImageUrl() {
//		return imageUrl;
//	}
//	public void setImageUrl(String imageUrl) {
//		this.imageUrl = imageUrl;
//	}
	
	@Override
	public String toString() {
		return "UserPojo [user_id=" + user_id + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", email=" + email + ", password=" + password + ", address=" + address + ", contact="
				+ contact + "]";
	}

  
}
