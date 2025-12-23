package com.Tns.javaPractices.studentData;

public class studentDataAccess {

	public static void main(String[] args) {
		System.out.println("******CSE department******");
		cSEDept cse = new cSEDept("Bharath",20);
		cse.database();
		cse.javaSub();
		cse.SpringSub();
		System.out.println("*******ECE department*********");
		eCEDept ece = new eCEDept("Sravan",20);
		ece.DigitalElectronics();
		ece.CompilerDesign();
		ece.Optical();
		System.out.println("********EEE department*********");
		eEEDept eee= new eEEDept("basha", 15);
		eee.Cables();
		eee.Current();
		eee.Wires();
	}

}
