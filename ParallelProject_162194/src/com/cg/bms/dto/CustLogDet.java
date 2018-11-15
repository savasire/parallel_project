package com.cg.bms.dto;

public class CustLogDet implements Comparable<CustLogDet> {
	private String accNumber;
	private String password;

	public CustLogDet(String accNumber, String password) {
		super();
		this.accNumber = accNumber;
		this.password = password;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Credentials [accNumber=" + accNumber + ", password=" + password
				+ "]";
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(accNumber);
	}

	@Override
	public boolean equals(Object obj) {
		CustLogDet cld= (CustLogDet) obj;
		if (cld.accNumber.equals(this.accNumber)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(CustLogDet cld) {
		if (Integer.parseInt(cld.accNumber) < Integer.parseInt(this.accNumber)) {
			return -1;
		} else if (cld.accNumber.equals(this.accNumber)) {
			return 0;
		} else {
			return +1;
		}

	}

}
