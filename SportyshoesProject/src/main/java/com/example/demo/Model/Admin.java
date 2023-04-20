package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Admin {
@Id
String UserName;
String Password;

public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
}
