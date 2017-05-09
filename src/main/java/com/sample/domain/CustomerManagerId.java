package com.sample.domain;

import java.io.Serializable;

public  class CustomerManagerId  implements Serializable{
	

    /**
	 * 
	 */
	private static final long serialVersionUID = -4144647311160329054L;

	private Long customer;
    
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