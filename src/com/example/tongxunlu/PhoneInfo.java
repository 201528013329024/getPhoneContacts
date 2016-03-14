package com.example.tongxunlu;

public class PhoneInfo {
	private String phoneName,phoneNumber;
	
	public PhoneInfo(String phoneName, String phoneNumber) {
		// TODO Auto-generated constructor stub
		setPhoneName(phoneName);
		setPhoneNumber(phoneNumber);
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
