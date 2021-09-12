package com.example.demo.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Balance;
@Transactional
@Repository("repoTwo")
public interface BalanceDAO extends JpaRepository<Balance,Integer>{
	@Query("Select BANKBALANCE from Balance where ACCOUNTNUMBER=?1")	
	public String fetchBANKBALANCE(long ACCOUNTNUMBER);
	
	@Modifying
	@Query("Update Balance set BANKBALANCE=BANKBALANCE+?2 WHERE ACCOUNTNUMBER=?1")
	public int addAmount(long AccountNumber,long Amount);
	
	@Modifying
	@Query("Update Balance set BANKBALANCE=BANKBALANCE-?2 WHERE ACCOUNTNUMBER=?1")
	public int removeAmount(long PAccountnumber,long Amount);
	
	@Query("FROM Balance WHERE ACCOUNTNUMBER=?1")
	public Optional<Balance> fetchACCOUNTNUMBER(long AccountNumber);
	
}
