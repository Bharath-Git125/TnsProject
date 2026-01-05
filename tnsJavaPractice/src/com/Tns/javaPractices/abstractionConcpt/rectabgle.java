package com.Tns.javaPractices.abstractionConcpt;

public class rectabgle extends shape {
	private int l,b;
	rectabgle(int l,int b){
		this.l=l;
		this.b=b;
	}
	public void setL(int l) {
		this.l=l;
	}
	public int getL() {
		return l;
	}
	public void setB(int b) {
		this.b=b;
	}
	public int getB() {
		return b;
	}
	public void calcArea() {
		area=l*b;
	}
}

