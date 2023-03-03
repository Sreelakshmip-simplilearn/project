package orgg.simplilearn.lms.service;

import orgg.simplilearn.lms.Dao.AirlinesDao;
import orgg.simplilearn.lms.Dao.AirlinesDaoimpl;
import orgg.simplilearn.lms.entity.Airlines;

public class AirlineServiceimpl implements AirlineService {

	AirlinesDao Dao=new AirlinesDaoimpl();

	@Override
	public void Delete(Airlines airline) {
	Dao.delete(airline);
	}
	
}
