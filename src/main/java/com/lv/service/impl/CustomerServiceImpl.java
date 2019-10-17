package com.lv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lv.dao.CustomerMapper;
import com.lv.po.Customer;
import com.lv.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public Customer selectCustomerByPrimaryKey(int id) {
		return customerMapper.selectByPrimaryKey(id);
	}

}
