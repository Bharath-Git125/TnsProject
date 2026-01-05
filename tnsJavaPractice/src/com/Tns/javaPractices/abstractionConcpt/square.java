package com.Tns.javaPractices.abstractionConcpt;

public class square extends shape {
	private int s;
	square(int s){
		this.s=s;
	}
	public void setS(int s) {
		this.s=s;
	}
	public int getS() {
		return s;
	}
	public void calcArea() {
		area=s*s;
	}
}
