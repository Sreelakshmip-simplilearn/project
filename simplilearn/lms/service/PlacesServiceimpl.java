package orgg.simplilearn.lms.service;


import orgg.simplilearn.lms.Dao.PlacesDao;
import orgg.simplilearn.lms.Dao.PlacesDaoimpl;
import orgg.simplilearn.lms.entity.Places;


public class PlacesServiceimpl implements PlacesService {
	PlacesDao Dao=new PlacesDaoimpl();

	@Override
	public void insert(Places Places) {
		Dao.insert(Places);
		
	}

	@Override
	public void delete(Places places) {
		Dao.delete(places);
		
	}
	
	
		
	}

