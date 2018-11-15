package com.cg.bms.service;

import com.cg.bms.dto.Customer;
import com.cg.bms.exception.TransactionException;

public interface BankService {
	public Customer signIn(String cstId, String cstPass);

	public void deposit(int depositAmount, Customer customer);

	public void withdraw(int withdrawAmount, Customer customer);

	public void transfer(int transferAmount, Customer customer, String reciever);

	public boolean validateWithdraw(String withdrawAmount, Customer customer)
			throws TransactionException;

	public boolean validateEnteredAmount(String withdrawAmount)
			throws TransactionException;

	public boolean validateNumber(String choose) throws TransactionException;

	public boolean validateName(String name) throws TransactionException;

	public String createAccount(String password, String custName, String accType);

}
