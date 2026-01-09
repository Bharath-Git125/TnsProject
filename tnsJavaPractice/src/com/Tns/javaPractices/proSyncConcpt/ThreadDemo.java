package com.Tns.javaPractices.proSyncConcpt;

public class ThreadDemo {
	int i;
	boolean flag=false;

	synchronized void deliver(int i) {
		if(flag)
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
		this.i=i;
		flag=true;
		System.out.println("msg is deliver "+i);
		notify();
	}
	synchronized int receiver() {
		if(!flag) //true
			try {
				wait();
			}catch (Exception e) {
				System.out.println(e);
			}
		System.out.println("msg is received "+i);
		flag = false;
		notify();
		return i;

	}

}
