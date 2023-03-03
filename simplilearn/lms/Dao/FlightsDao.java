package orgg.simplilearn.lms.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import orgg.simplilearn.lms.entity.Flights;

public interface FlightsDao {

	void insert(Flights flights);
	void delete(Flights flights);
	void update(Flights flights);
	 List<Flights> get(String source,String destination);
	 public List<Flights> getAll();
			


}
