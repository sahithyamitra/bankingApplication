package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Login {
	@Id
	@SequenceGenerator(name = "seqgen3", sequenceName = "sequence3", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqgen3")
	private int LOGINID;
	@Column(name="CUSTID",unique=true,insertable=true,updatable=true)
	private String CUSTID;
	@Column(name="PWD",insertable=true,updatable=true)
	private String PWD;
	public int getLOGINID() {
		return LOGINID;
	}
	public void setLOGINID(int lOGINID) {
		LOGINID = lOGINID;
	}
	public String getCUSTID() {
		return CUSTID;
	}
	public void setCUSTID(String cUSTOMERID) {
		CUSTID = cUSTOMERID;
	}
	public String getPWD() {
		return PWD;
	}
	public void setPWD(String pWD) {
		PWD = pWD;
	}
	@Override
	public String toString() {
		return "Login [LOGINID=" + LOGINID + ", CUSTOMERID=" + CUSTID + ", PWD=" + PWD + "]";
	}
}
