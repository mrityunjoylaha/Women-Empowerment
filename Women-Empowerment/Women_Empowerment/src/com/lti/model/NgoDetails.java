package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component("ngoDetails")
@Entity
@Table(name="NGO_Details")
public class NgoDetails {
	@Id
	@Column(name="Ngo_Id")
	private int ngoId;
	@Column(name="Ngo_name")
	private String ngoName;
	@Column(name="Ngo_head")
	private String ngoHead;
	@Column(name="Ngo_panhead")
	private String ngoPanNo;
	@Column(name="Ngo_gender")
	private String ngoGender;
	@Column(name="Ngo_desig")
	private String ngoDesignation;
	@Column(name="Ngo_email")
	private String ngoEmail;
	@Column(name="Ngo_phone")
	private int ngoPhoneNo;
	@Column(name="Ngo_website")
	private String ngoWebsite;

	public NgoDetails() {
		super();
	}

	public NgoDetails(int ngoId, String ngoName, String ngoHead, String ngoPanNo, String ngoGender,
			String ngoDesignation, String ngoEmail, int ngoPhoneNo, String ngoWebsite) {
		super();
		this.ngoId = ngoId;
		this.ngoName = ngoName;
		this.ngoHead = ngoHead;
		this.ngoPanNo = ngoPanNo;
		this.ngoGender = ngoGender;
		this.ngoDesignation = ngoDesignation;
		this.ngoEmail = ngoEmail;
		this.ngoPhoneNo = ngoPhoneNo;
		this.ngoWebsite = ngoWebsite;
	}

	public int getNgoId() {
		return ngoId;
	}

	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}

	public String getNgoName() {
		return ngoName;
	}

	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}

	public String getNgoHead() {
		return ngoHead;
	}

	public void setNgoHead(String ngoHead) {
		this.ngoHead = ngoHead;
	}

	public String getNgoPanNo() {
		return ngoPanNo;
	}

	public void setNgoPanNo(String ngoPanNo) {
		this.ngoPanNo = ngoPanNo;
	}

	public String getNgoGender() {
		return ngoGender;
	}

	public void setNgoGender(String ngoGender) {
		this.ngoGender = ngoGender;
	}

	public String getNgoDesignation() {
		return ngoDesignation;
	}

	public void setNgoDesignation(String ngoDesignation) {
		this.ngoDesignation = ngoDesignation;
	}

	public String getNgoEmail() {
		return ngoEmail;
	}

	public void setNgoEmail(String ngoEmail) {
		this.ngoEmail = ngoEmail;
	}

	public int getNgoPhoneNo() {
		return ngoPhoneNo;
	}

	public void setNgoPhoneNo(int ngoPhoneNo) {
		this.ngoPhoneNo = ngoPhoneNo;
	}

	public String getNgoWebsite() {
		return ngoWebsite;
	}

	public void setNgoWebsite(String ngoWebsite) {
		this.ngoWebsite = ngoWebsite;
	}

	@Override
	public String toString() {
		return "NgoDetails [ngoId=" + ngoId + ", ngoName=" + ngoName + ", ngoHead=" + ngoHead + ", ngoPanNo=" + ngoPanNo
				+ ", ngoGender=" + ngoGender + ", ngoDesignation=" + ngoDesignation + ", ngoEmail=" + ngoEmail
				+ ", ngoPhoneNo=" + ngoPhoneNo + ", ngoWebsite=" + ngoWebsite + "]";
	}

}
