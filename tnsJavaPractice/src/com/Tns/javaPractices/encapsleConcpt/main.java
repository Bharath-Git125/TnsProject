package com.Tns.javaPractices.encapsleConcpt;

public class main {

	public static void main(String[] args) {
		TnsEnquiry tns = new TnsEnquiry();
		tns.setName("Bharath");
		tns.setRollNo(504);
		tns.setBatch(04.00);
		tns.setUID("tt100600411");
		System.out.println(tns.getName());
		System.out.println(tns.getRollNo());
		System.out.println(tns.getBatch());
		System.out.println(tns.getUID());
	}

}
