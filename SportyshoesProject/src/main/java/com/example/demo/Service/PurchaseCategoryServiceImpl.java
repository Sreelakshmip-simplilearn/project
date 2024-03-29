package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ProductCategory;

@Service(value = "productCategoryService")
	public class ProductCategoryServiceImpl implements ProductCategoryService {
		
		@Autowired
		ProductCategoryRepository productCategoryRepository;

		@Override
		public ProductCategory getCategoryById(Long id) {
			// TODO Auto-generated method stub
			return productCategoryRepository.findById(id).get();
		}

		@Override
		public void updateCategory(ProductCategory category) {
			productCategoryRepository.save(category);
			
			
		}

		@Override
		public void deleteCategory(Long id) {
			productCategoryRepository.deleteById(id);
			
		}
		
		@Override
		public ProductCategory saveCategory(ProductCategory category) {
			return productCategoryRepository.save(category);
		}


		@Override
		public List<ProductCategory> fetchProductCategoryList() {
			return productCategoryRepository.findAll();
			
		}

	}
}
