package com.example.demo.model;

public class ChangePWD {
	private String pwd;
	private String newPwd;
	private String confirmPwd;
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	public String getConfirmPwd() {
		return confirmPwd;
	}
	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	@Override
	public String toString() {
		return pwd+','+newPwd+','+confirmPwd;
	}
}
