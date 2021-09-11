package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Balance {
	@Id
	@GeneratedValue
	private int balanceId;
	private long accountNum;
	private long bankBalance;
	@Override
	public String toString() {
		return "Balance [Id=" + balanceId + ", accountNum=" + accountNum + ", bankBalance=" + bankBalance + "]";
	}
	public int getBalanceId() {
		return balanceId;
	}
	public void setBalanceId(int balanceId) {
		this.balanceId = balanceId;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public long getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(long bankBalance) {
		this.bankBalance = bankBalance;
	}
}
