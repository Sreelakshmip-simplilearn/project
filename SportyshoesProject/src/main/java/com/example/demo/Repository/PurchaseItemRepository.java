package com.example.demo.Repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.PurchaseItem;
import com.example.demo.Model.User;

public interface PurchaseItemRepository extends JpaRepository<PurchaseItem, Long>{

		List<PurchaseItem> findByUser(User user, Sort sort);
	}

