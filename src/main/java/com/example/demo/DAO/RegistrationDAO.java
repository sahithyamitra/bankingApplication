package com.example.demo.DAO;
import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Registration;
@Transactional
public interface RegistrationDAO extends JpaRepository<Registration,Integer>{
	
	@Query("from Registration where CUSTOMERID=?1 AND PWD=?2")
	public Optional<Registration> checkLogin(String CUSTOMERID,String PWD);
	
	public Optional<Registration> findByPWD(String PWD);
	
	@Modifying
	@Query("update Registration set PWD=?1 where PWD=?2")
	public int changePwd(String newPWD,String PWD);
}
