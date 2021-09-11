package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Balance;

public interface BalanceDAO extends JpaRepository<Balance,Integer>{
	
	public Optional<Balance> findByaccountNum(long AccountNum);
	
	@Query(value="select bankBalance from Balance where accountNum=?1",nativeQuery=true)
	public long findByBalance(long AccountNum);
}
