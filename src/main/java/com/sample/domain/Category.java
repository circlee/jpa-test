package com.sample.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = false)
public class Category  implements Serializable{



	/**
	 * 
	 */
	private static final long serialVersionUID = 7358242943473807765L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;

	public Category(){

	}

	@OneToMany(mappedBy = "category",cascade={CascadeType.ALL}, orphanRemoval=true)
	private List<Product> products;
	
	@OneToMany(mappedBy = "category",cascade={CascadeType.REMOVE})
	private Product mainProduct;

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Category(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	

	@Override
	public String toString() {
		return "Category [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}

	


}