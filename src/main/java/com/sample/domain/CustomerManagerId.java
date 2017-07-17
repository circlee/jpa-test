package com.sample.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public  class CustomerManagerId  implements Serializable{
	

    /**
	 * 
	 */
	private static final long serialVersionUID = -4144647311160329054L;

	
	private Long customer;
    
	@JsonIgnore
    private Long manager;

	public Long getCustomer() {
		return customer;
	}

	public void setCustomer(Long customer) {
		this.customer = customer;
	}

	public Long getManager() {
		return manager;
	}

	public void setManager(Long manager) {
		this.manager = manager;
	}

}