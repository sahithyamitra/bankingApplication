package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="BALANCE")
public class Balance {
	@Id
	@SequenceGenerator(name = "sequen", sequenceName = "sequence3", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequen")
	@Column(name="BALID")
	private int BALID;
	@Column(name="ACCOUNTNUMBER",unique=true,insertable=true,updatable=true)
	private long ACCOUNTNUMBER;
	@Column(name="BANKBALANCE",insertable=true,updatable=true)
	private long BANKBALANCE;
	public int getBALID() {
		return BALID;
	}
	public void setBALID(int bALID) {
		BALID = bALID;
	}
	public long getACCOUNTNUMBER() {
		return ACCOUNTNUMBER;
	}
	public void setACCOUNTNUMBER(long aCCOUNTNUMBER) {
		ACCOUNTNUMBER = aCCOUNTNUMBER;
	}
	public long getBANKBALANCE() {
		return BANKBALANCE;
	}
	public void setBANKBALANCE(long bANKBALANCE) {
		BANKBALANCE = bANKBALANCE;
	}
	@Override
	public String toString() {
		return "Balance [BALID=" + BALID + ", ACCOUNTNUMBER=" + ACCOUNTNUMBER + ", BANKBALANCE=" + BANKBALANCE + "]";
	} 
	
}
