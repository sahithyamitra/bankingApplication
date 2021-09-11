package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Balance {
	@Id
	@SequenceGenerator(name = "sequ", sequenceName = "sequence3", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequ")
	private int balanceId;
	private long accountNum;
	private long bankBalance;
	@Override
	public String toString() {
		return "Balance [Id=" + balanceId + ", accountNum=" + accountNum + ", bankBalance=" + bankBalance + "]";
	}
	public int getbalanceId() {
		return balanceId;
	}
	public void setbalanceId(int balanceId) {
		this.balanceId = balanceId;
	}
	public long getaccountNum() {
		return accountNum;
	}
	public void setaccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public long getbankBalance() {
		return bankBalance;
	}
	public void setbankBalance(long bankBalance) {
		this.bankBalance = bankBalance;
	}
}
