package com.Tns.javaPractices.ThreadConcpt;

public class RunDemo {

	public static void main(String[] args) {
		runThread rl = new runThread();
		Thread tl = new Thread(rl);
		tl.start();
}

}
