package com.practice;

public class SecondClass {

	public static void main(String[] args) {
	calculator(5,5);

	}
	public static void calculator(int a, int b){
		int add= a+b;
		int sub=a-b;
		int mult=a*b;
		int div=a/b;
		System.out.println("add result"+add);
		System.out.println("subtract result"+sub);
		System.out.println("mutiply result"+mult);
		System.out.println("divide result"+div);
	}

}
