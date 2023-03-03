package orgg.simplilearn.lms.service;

import orgg.simplilearn.lms.entity.Admin;
import orgg.simplilearn.lms.entity.User;

public interface UserService {
	void insert(User user);
	User get(String Name,String Password);
	void updatepassword(String Name,String Password);
}
