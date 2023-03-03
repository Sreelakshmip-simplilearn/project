package orgg.simplilearn.lms.service;


import orgg.simplilearn.lms.Dao.FlightsDao;
import orgg.simplilearn.lms.Dao.FlightsDaoimpl;
import orgg.simplilearn.lms.entity.Flights;

public class FlightServiceimpl implements FlightService {

	FlightsDao dao=new FlightsDaoimpl();
	@Override
	public void insert(Flights flights) {
		dao.insert(flights);
		
	}
	@Override
	public void update(Flights flights) {
		dao.update(flights);
		
	}
	@Override
	public void delete(Flights flights) {
		dao.delete(flights);
		
	}



	}

