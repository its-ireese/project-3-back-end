package com.project3.revtech.request;

import java.util.Set;

import javax.validation.constraints.*;

public class SignupRequest {
  @NotBlank
  @Size(min = 3, max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  private Set<String> role;

  @NotBlank
  @Size(min = 6, max = 40)
  private String password;
  
  @NotBlank
  @Size(max = 20)
  private String first_name;
  
  @NotBlank
  @Size(max = 20)
  private String last_name;
  
  @NotBlank
  @Size(max = 200)
  private String address;
  
  @NotBlank
  @Size(min = 10)
  private String contact;
  
  //private String imageUrl;

 
public String getFirst_name() {
	return first_name;
}

public void setFirst_name(String first_name) {
	this.first_name = first_name;
}

public String getLast_name() {
	return last_name;
}

public void setLast_name(String last_name) {
	this.last_name = last_name;
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

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }
  
//  public String getImageUrl() {
//	 return imageUrl;
//	}
//
//  public void setImageUrl(String imageUrl) {
//	this.imageUrl = imageUrl;
//	}

}
