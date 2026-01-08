package com.Tns.javaPractices.ThreadConcpt;

public class classMultiThread extends Thread{
	public void run() {
		try {
			System.out.println("I am executed!!!!");
			System.out.println("Current thread: " + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("Thread finished sleeping");
		}catch (Exception e) {
			System.out.println("exception occur");
		}
	}

}
