package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Balance;

public interface BalanceDAO extends JpaRepository<Balance,Integer>{
	
	public List<Balance> findByAccountNum(String AccountNum);
	
	@Query(value="from Balance where accountNum=?1",nativeQuery=true)
	public Balance findByBalance(long AccountNum);
}
