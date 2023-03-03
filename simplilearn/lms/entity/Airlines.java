package orgg.simplilearn.lms.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity

public class Airlines {
String Airlinename;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int airlineid;
@OneToMany(mappedBy="airline",cascade=CascadeType.ALL)
private Set<Flights> flig=new HashSet<>();
public String getAirlinename() {
	return Airlinename;
}
public void setAirlinename(String airlinename) {
	Airlinename = airlinename;
}
public int getairlineid() {
	return airlineid;
}
public void setairlineid(int airlineid) {
	this.airlineid = airlineid;
}


}
