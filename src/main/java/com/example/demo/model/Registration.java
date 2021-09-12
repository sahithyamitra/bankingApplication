package com.example.demo.model;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Registration {
	@Id
	@SequenceGenerator(name = "seq", sequenceName = "sequence2", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private int REGID;
	private String FIRSTNAME;
	private String MIDDLENAME;
	private String LASTNAME;
	private long MOBILE;
	private String EMAIL;
	private String DOB; 
	private String PANCARD;
	private long ACCOUNTNUM;
	private String CUSTOMERID;
	private long AADHAR;
	private int DOORNO;
	private String HOUSENAME,STREET,AREA,DISTRICT,CITY,COUNTRY;
	private String PWD;
	private String CONFIRMPWD;
	public void setACCOUNTNUM(long accountNum) {
		this.ACCOUNTNUM=accountNum;
	}
	public void setCUSTOMERID(String cUSTOMERID) {
		this.CUSTOMERID=cUSTOMERID;
	}
	public int getREGID() {
		return REGID;
	}
	public void setREGID(int rEGID) {
		REGID = rEGID;
	}
	public String getFIRSTNAME() {
		return FIRSTNAME;
	}
	public void setFIRSTNAME(String firstName) {
		this.FIRSTNAME = firstName;
	}
	public String getMIDDLENAME() {
		return MIDDLENAME;
	}
	public void setMIDDLENAME(String middleName) {
		this.MIDDLENAME = middleName;
	}
	public String getLASTNAME() {
		return LASTNAME;
	}
	public void setLASTNAME(String lastName) {
		this.LASTNAME = lastName;
	}
	public long getMOBILE() {
		return MOBILE;
	}
	public void setMOBILE(long mobile) {
		this.MOBILE = mobile;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String email) {
		this.EMAIL = email;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dob) {
		this.DOB = dob;
	}
	public String getPANCARD() {
		return PANCARD;
	}
	public void setPANCARD(String panCard) {
		this.PANCARD = panCard;
	}
	public long getACCOUNTNUM() {
		return ACCOUNTNUM;
	}
	public String getCUSTOMERID() {
		return CUSTOMERID;
	}
	public long getAADHAR() {
		return AADHAR;
	}
	public void setAADHAR(long aadhar) {
		this.AADHAR = aadhar;
	}
	public int getDOORNO() {
		return DOORNO;
	}
	public void setDOORNO(int doorNo) {
		this.DOORNO = doorNo;
	}
	public String getHOUSENAME() {
		return HOUSENAME;
	}
	public void setHOUSENAME(String houseName) {
		this.HOUSENAME = houseName;
	}
	public String getSTREET() {
		return STREET;
	}
	public void setSTREET(String street) {
		this.STREET = street;
	}
	public String getAREA() {
		return AREA;
	}
	public void setAREA(String area) {
		this.AREA = area;
	}
	public String getDISTRICT() {
		return DISTRICT;
	}
	public void setDISTRICT(String district) {
		this.DISTRICT = district;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String city) {
		this.CITY = city;
	}
	public String getCOUNTRY() {
		return COUNTRY;
	}
	public void setCOUNTRY(String country) {
		COUNTRY = country;
	}
	public String getPWD() {
		return PWD;
	}
	public void setPWD(String pwd) {
		this.PWD = pwd;
	}
	public String getCONFIRMPWD() {
		return CONFIRMPWD;
	}
	public void setCONFIRMPWD(String confirmPwd) {
		this.CONFIRMPWD = confirmPwd;
	}
	@Override
	public String toString() {
		return "Registration [REGID=" + REGID + ", FIRSTNAME=" + FIRSTNAME + ", MIDDLENAME=" + MIDDLENAME
				+ ", LASTNAME=" + LASTNAME + ", MOBILE=" + MOBILE + ", EMAIL=" + EMAIL + ", DOB=" + DOB
				+ ", PANCARD=" + PANCARD + ", ACCOUNTNUM=" + ACCOUNTNUM + ", CUSTOMERID=" + CUSTOMERID + ", AADHAR="
				+ AADHAR + ", DOORNO=" + DOORNO + ", HOUSENAME=" + HOUSENAME + ", STREET=" + STREET + ", AREA="
				+ AREA + ", DISTRICT=" + DISTRICT + ", CITY=" + CITY + ", COUNTRY=" + COUNTRY + ", PWD=" + PWD
				+ ", CONFIRMPWD=" + CONFIRMPWD + "]";
	}
}
