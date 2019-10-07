package com.nt.entity;

import java.io.Serializable;

public class InsurancePolicyImpl implements Serializable, InsurancePolicy {

	private int policyID;
	private String policyName;
	private int tenure;
	private String company;
	private float initialAmount;
	
	public InsurancePolicyImpl() {
		System.out.println("InsurancePolicyImpl::0-param constructor");
		
	}
	
	public int getPolicyID() {
		return policyID;
	}
	public void setPolicyID(int policyID) {
		this.policyID = policyID;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public float getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(float initialAmount) {
		this.initialAmount = initialAmount;
	}
	
	



}
