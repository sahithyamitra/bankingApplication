package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Login;

@Transactional
public interface LoginDAO extends JpaRepository<Login,Integer>{
	
	public boolean existsByCUSTID(String CustId);
	
	@Query("Select PWD from Login where CUSTID=?1")
	public String fetchPWD(String CustId);
}
