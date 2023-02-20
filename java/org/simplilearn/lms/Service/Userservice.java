package org.simplilearn.lms.Service;

import org.simplilearn.lms.entity.User;

public interface Userservice {
	void insert(User user);
	User get(String username,String password);
	void updatepassword(String username,String password);
}
