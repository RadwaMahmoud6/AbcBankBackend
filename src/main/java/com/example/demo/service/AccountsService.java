package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.AccountsEntity;
import com.example.demo.entities.CustomerEntity;
import com.example.demo.model.AccountRequest;
import com.example.demo.model.AccountResponse;
import com.example.demo.model.CustomerResponse;
import com.example.demo.repository.AccountsRepo;
import com.example.demo.repository.CustomerRepo;

@Service
public class AccountsService {
	
	@Autowired
	private AccountsRepo accrep;
	
	@Autowired
	private CustomerRepo custrepo;
	
	public AccountResponse getAccounts(AccountRequest accreq) 
	{
		AccountResponse accresp = new AccountResponse();
		AccountsEntity accent  = accrep.findById(accreq.getAccountNumber()).get();
		
		BeanUtils.copyProperties(accent, accresp);
		
		return accresp;
	}
	
	public CustomerResponse getCustomers(AccountRequest accreq) 
	{
		
		CustomerResponse custresp = new CustomerResponse();
		AccountsEntity accent  = accrep.findById(accreq.getAccountNumber()).get();
		//AccountResponse resp = new AccountResponse();
		int custid = accent.getCustomerNum();
		CustomerEntity custent = custrepo.findById(custid).get();
		BeanUtils.copyProperties(custent, custresp);
		return custresp;
	}
}
