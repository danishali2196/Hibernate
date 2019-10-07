
package com.nt.entity;

public interface InsurancePolicy {
	
	public int getPolicyID() ;
	public void setPolicyID(int policyID) ;
	public String getPolicyName();
	public void setPolicyName(String policyName);
	public int getTenure();
	public void setTenure(int tenure);
	public String getCompany() ;
	public void setCompany(String company);
	public float getInitialAmount();
	public void setInitialAmount(float initialAmount);

}
