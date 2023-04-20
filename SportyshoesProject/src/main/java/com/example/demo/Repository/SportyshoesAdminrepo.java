package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Admin;

public interface SportyshoesAdminrepo extends JpaRepository<Admin,String>
{
	@Query("Select admin from Admin admin where admin.UserName=?1")
public Admin findbyUserName(String UserName);
	@Query("Select admin from Admin admin where admin.Password=?1")
public Admin findbyPassword(String Password);

	void insert(Admin admin);

}
