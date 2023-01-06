package com.example.rupesh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rupesh.models.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findBySourceAccountIdOrderByInitiationDate(long id);
}
