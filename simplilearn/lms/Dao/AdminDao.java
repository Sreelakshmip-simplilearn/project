package orgg.simplilearn.lms.Dao;

import orgg.simplilearn.lms.entity.Admin;

public interface AdminDao {
	void insert(Admin admin);
	Admin get(String Name,String Password);
	void update(Admin admin);
}
