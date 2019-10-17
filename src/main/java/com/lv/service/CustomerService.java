package com.lv.service;

import com.lv.po.Customer;

public interface CustomerService {
	Customer selectCustomerByPrimaryKey(int id);
	
}
