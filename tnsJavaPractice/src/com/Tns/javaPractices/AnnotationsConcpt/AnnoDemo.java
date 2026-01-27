package com.Tns.javaPractices.AnnotationsConcpt;

public class AnnoDemo {
	void show() {
		System.out.println("iam A");
	}

}
class B extends AnnoDemo{
	@Override
	void show() {
		System.out.println("iam B");
	}
}
