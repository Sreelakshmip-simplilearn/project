package orgg.simplilearn.lms.Dao;

import java.util.List;


import orgg.simplilearn.lms.entity.Places;

public interface PlacesDao {
	void insert(Places places);
	void delete(Places places);
	void update(Places places);
	 public List<Places> getAll();

}
