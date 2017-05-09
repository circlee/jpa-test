package com.sample.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;


@IdClass(CustomerManagerId.class)
@Entity
@EqualsAndHashCode(callSuper = false)
public class CustomerManager  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5342162288092187773L;

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id",referencedColumnName="id")
    private Customer customer;
    
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "manager_id",referencedColumnName="id")
    private Manager manager;

	public CustomerManager(){
		
	}
	public CustomerManager(Customer customer, Manager manager) {
		super();
		this.customer = customer;
		this.manager = manager;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "CustomerManager [customer=" + customer + ", manager=" + manager + "]";
	}
	
}