package org.simplilearn.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int stid;
private String Name;
private String address;
private int age;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="cid")
private AcademicClass academiclass;
public int getStid() {
	return stid;
}
public void setStid(int stid) {
	this.stid = stid;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public AcademicClass getAcademiclass() {
	return academiclass;
}
public void setAcademiclass(AcademicClass academiclass) {
	this.academiclass = academiclass;
}

}
