package org.simplilearn.lms.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class AcademicClass {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int cid;
private String name;
private int duration;
@ManyToMany(mappedBy="academic",cascade=CascadeType.ALL)
private Set<Subject> subject=new HashSet<>();
@OneToMany(mappedBy="academiclass",cascade=CascadeType.ALL)
private Set<Student> stude=new HashSet<>();
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public Set<Subject> getSubject() {
	return subject;
}
public void setSubject(Set<Subject> subject) {
	this.subject = subject;
}
public Set<Student> getStude() {
	return stude;
}
public void setStude(Set<Student> stude) {
	this.stude = stude;
}

public void addSubject(Subject subjec)
{
	subject.add(subjec);
}




}
