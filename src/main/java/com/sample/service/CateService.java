package com.sample.service;



import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.domain.Category;
import com.sample.domain.Customer;
import com.sample.domain.CustomerManager;
import com.sample.domain.Manager;
import com.sample.domain.Product;
import com.sample.repository.CategoryRepository;
import com.sample.repository.CustomerManagerRepository;
import com.sample.repository.ManagerRepository;
import com.sample.repository.ProductRepository;

@Service
public class CateService {


	private static final Logger log = LoggerFactory.getLogger(CateService.class);

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;


	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}


	public Category getCategory(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findOne(id);
	}


	@Transactional
	public void setCategory(Category category) {
		categoryRepository.save(category);
	}

	@Transactional
	public void modifyCategory(Category category) {
		categoryRepository.save(category);
	}


	public List<Product> getCategoryProducts(Long categoryId) {
		return categoryRepository.findOne(categoryId).getProducts();
	}

	@Transactional
	public void setCategoryProduct(Long categoryId, Product product) {
		product.setCategory(categoryRepository.findOne(categoryId));
		productRepository.save(product);
	}


	public Product getProduct(Long id) {
		return productRepository.findOne(id);
	}

	@Transactional
	public void modifyProduct(Product product) {
		productRepository.save(product);
		
	}

	@Transactional
	public void deleteCategory(Long id) {
		categoryRepository.delete(id);
	}

	@Transactional
	public void deleteCategoryProduct(Long categoryId) {
		Category c = categoryRepository.findOne(categoryId);
		c.setProducts(null);
		categoryRepository.save(c);
		
	}

}
