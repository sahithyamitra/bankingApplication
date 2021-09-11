package com.example.demo.model;

public class Login {
	private String CUSTOMERID;
	private String PWD;
	public String getCUSTOMERID() {
		return CUSTOMERID;
	}
	public void setCUSTOMERID(String cUSTOMERID) {
		CUSTOMERID = cUSTOMERID;
	}
	public String getPWD() {
		return PWD;
	}
	public void setPWD(String pWD) {
		PWD = pWD;
	}
	@Override
	public String toString() {
		return "LogIn [customerId=" + CUSTOMERID + ", pwd=" + PWD + "]";
	}
}
