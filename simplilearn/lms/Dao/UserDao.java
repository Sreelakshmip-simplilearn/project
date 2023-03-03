package orgg.simplilearn.lms.Dao;

import orgg.simplilearn.lms.entity.User;

public interface UserDao {
	void insert(User user);
	void delete(User user);
	void update(User user);
	User get(String Name,String Password);
}
