package com.project3.revtech.service;

import java.util.List;

import com.project3.revtech.pojo.TransactionPojo;

public interface TransactionService {

	
	public List<TransactionPojo> getAllTransactions();
	public TransactionPojo getTransactionById(int transactionId);
	public List<TransactionPojo> findAllTransactionsInCart(int cartId);
	public TransactionPojo createTransaction(TransactionPojo tp);
	public TransactionPojo deleteTransaction(TransactionPojo tp);
	public TransactionPojo updateTransaction(TransactionPojo tp);
	
}
