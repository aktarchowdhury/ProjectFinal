package com.test.object;

public class ObjectPractice2 {

	public static void main(String[] args) {
		ObjectPractice1 obj= new ObjectPractice1();
		obj.Checkout();
		obj.Checkout1();
		obj.Checkout2();
		Reconcile();
		Reconcile1();

	}

	public static void Reconcile() {
		System.out.println("What is next after celebration");

	}

	public static void Reconcile1() {
		System.out.println("Go Home and sleep");
	}

}
