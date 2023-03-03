package orgg.simplilearn.lms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
String name;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int uid;
String Password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}

}
