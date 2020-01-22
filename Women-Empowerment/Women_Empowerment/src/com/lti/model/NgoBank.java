package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component("ngoBank")
@Entity
@Table(name = "NGO_bank")
public class NgoBank {
	@Id
	@Column(name = "account_no")
	private long accountNumber;
	@Column(name = "account_holder")
	private String accountHolder;
	@Column(name = "bank_name")
	private String bankName;
	@Column(name = "branch")
	private String branch;
	@Column(name = "IFSC_code")
	private String ifscCode;

	@JoinColumn(name = "ngoid")
	private NgoDetails ngoDetails;

	public NgoBank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NgoBank(long accountNumber, String accountHolder, String bankName, String branch, String ifscCode,
			NgoDetails ngoDetails) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.bankName = bankName;
		this.branch = branch;
		this.ifscCode = ifscCode;
		this.ngoDetails = ngoDetails;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public NgoDetails getNgoDetails() {
		return ngoDetails;
	}

	public void setNgoDetails(NgoDetails ngoDetails) {
		this.ngoDetails = ngoDetails;
	}

	@Override
	public String toString() {
		return "NgoBank [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", bankName=" + bankName
				+ ", branch=" + branch + ", ifscCode=" + ifscCode + ", ngoDetails=" + ngoDetails + "]";
	}
}

