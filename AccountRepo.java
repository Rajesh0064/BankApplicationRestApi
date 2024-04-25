package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.BankAccount;
@Repository
public interface AccountRepo extends JpaRepository<BankAccount, Long> {

	BankAccount findByAccountNumberAndAccountNameAndPassword(long accountNumber, String accountName, String password);

	BankAccount findByAccountNumber(long accountNumber);

	void deleteById(long accountNumber);

	

	

}
