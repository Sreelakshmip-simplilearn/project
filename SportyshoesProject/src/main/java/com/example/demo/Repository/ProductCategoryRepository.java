package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ProductCategory;

public interface ProductCategoryRepository  extends JpaRepository<ProductCategory,Long >{

}
