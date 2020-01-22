package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component("ngoProjectIncharge")
@Entity
@Table(name = "ngo_project_incharge")
public class NgoProjectIncharge {
	@Id
	@Column(name = "pro_name")
	private String projectName;
	@Column(name = "incharge_name")
	private String inchargeName;
	@Column(name = "in_email")
	private String inchargeEmail;
	@Column(name = "in_contact")
	private String inchargeContact;

	@JoinColumn(name = "ngoid")
	private NgoDetails ngoDetails;

	public NgoProjectIncharge() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NgoProjectIncharge(String projectName, String inchargeName, String inchargeEmail, String inchargeContact,
			NgoDetails ngoDetails) {
		super();
		this.projectName = projectName;
		this.inchargeName = inchargeName;
		this.inchargeEmail = inchargeEmail;
		this.inchargeContact = inchargeContact;
		this.ngoDetails = ngoDetails;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getInchargeName() {
		return inchargeName;
	}

	public void setInchargeName(String inchargeName) {
		this.inchargeName = inchargeName;
	}

	public String getInchargeEmail() {
		return inchargeEmail;
	}

	public void setInchargeEmail(String inchargeEmail) {
		this.inchargeEmail = inchargeEmail;
	}

	public String getInchargeContact() {
		return inchargeContact;
	}

	public void setInchargeContact(String inchargeContact) {
		this.inchargeContact = inchargeContact;
	}

	public NgoDetails getNgoDetails() {
		return ngoDetails;
	}

	public void setNgoDetails(NgoDetails ngoDetails) {
		this.ngoDetails = ngoDetails;
	}

	@Override
	public String toString() {
		return "NgoProjectIncharge [projectName=" + projectName + ", inchargeName=" + inchargeName + ", inchargeEmail="
				+ inchargeEmail + ", inchargeContact=" + inchargeContact + ", ngoDetails=" + ngoDetails + "]";
	}

}
