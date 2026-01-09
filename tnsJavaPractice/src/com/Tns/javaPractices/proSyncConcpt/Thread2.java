package com.Tns.javaPractices.proSyncConcpt;

public class Thread2 extends Thread{

	ThreadDemo obj;
	public Thread2(ThreadDemo obj) {
		this.obj=obj;

	}
	public void run() {
		for(int y =1;y<5;y++) {
			obj.receiver();;
		}
	}

}
