package com.sample.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.domain.Category;
import com.sample.domain.Manager;
import com.sample.domain.Product;
import com.sample.service.CateService;

@RestController
@RequestMapping("/category")
public class TestController {
	
	
	@Inject
	CateService cateService;
	
	
	@GetMapping()
	public List<Category> getAllCategories(){
		return cateService.getAllCategories();
	}
	
	@GetMapping("/{id}")
	public Category getCategory(@PathVariable("id") Long id){
		return cateService.getCategory(id);
	}
	
	@PostMapping()
	public void setCategory(@RequestBody Category category){
		cateService.setCategory(category);
	}
	
	@PostMapping("/{id}")
	public void modifyCategory(@PathVariable("id") Long id, @RequestBody Category category){
		category.setId(id);
		cateService.modifyCategory(category);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable("id") Long id){
		cateService.deleteCategory(id);
	}
	
	
	@GetMapping("/{categoryId}/products")
	public List<Product> getCategoryProducts(@PathVariable("categoryId") Long categoryId){
		return cateService.getCategoryProducts(categoryId);
	}
	
	@PostMapping("/{categoryId}/products")
	public void setCategoryProduct(@PathVariable("categoryId") Long categoryId, @RequestBody Product product){
		cateService.setCategoryProduct(categoryId, product);
	}
	@DeleteMapping("/{categoryId}/products")
	public void deleteCategoryProduct(@PathVariable("categoryId") Long categoryId){
		cateService.deleteCategoryProduct(categoryId);
	}
	
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable("id") Long id){
		return cateService.getProduct(id);
	}

	@PostMapping("/customer/{id}")
	public void modifyProduct(@PathVariable("id") Long id, @RequestBody Product product){
		product.setId(id);
		cateService.modifyProduct(product);
	}
	


}
