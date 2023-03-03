package orgg.simplilearn.lms.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Flights {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
int flightid;
String flightname;
String source;
String destination;
String Date;
String Price;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="airlineid")
private Airlines airline;
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(
        name="Flights_Places",
        joinColumns=
            @JoinColumn(name="flightid"),
        inverseJoinColumns=
            @JoinColumn(name="tripid")
    )
private Set<Places> places=new HashSet<>();

public String getFlightname() {
	return flightname;
}
public void setFlightname(String flightname) {
	this.flightname = flightname;
}
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
public int getFlightid() {
	return flightid;
}
public void setFlightid(int flightid) {
	this.flightid = flightid;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}
public Airlines getAirline() {
	return airline;
}
public void setAirline(Airlines airline) {
	this.airline = airline;
}
public Set<Places> getPlaces() {
	return places;
}
public void setPlaces(Set<Places> places) {
	this.places = places;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}

}