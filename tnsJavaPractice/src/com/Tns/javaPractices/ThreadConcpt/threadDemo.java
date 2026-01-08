package com.Tns.javaPractices.ThreadConcpt;


public class threadDemo {

	public static void main(String[] args) throws Exception {
		classMultiThread ml = new classMultiThread();
		ml.start();
		System.out.println("Main thread: " + Thread.currentThread().getName());
		Thread.sleep(2000);
		System.out.println("Main thread finished");

	}

}
