package orgg.simplilearn.lms.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Places {
String source;
String destination;
String starttime;
String endtime;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int tripid;
@ManyToMany(mappedBy="places",cascade=CascadeType.ALL)
private Set<Flights> flights=new HashSet<>();
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}

public int getTripid() {
	return tripid;
}
public void setTripid(int tripid) {
	this.tripid = tripid;
}
public String getStarttime() {
	return starttime;
}
public void setStarttime(String starttime) {
	this.starttime = starttime;
}
public String getEndtime() {
	return endtime;
}
public void setEndtime(String endtime) {
	this.endtime = endtime;
}
public Set<Flights> getFlights() {
	return flights;
}
public void setFlights(Set<Flights> flights) {
	this.flights = flights;
}

}