package com.project3.revtech.dao;

import java.util.List;

import com.project3.revtech.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    List<Transaction> findAllByCartId(int cartId);

}
