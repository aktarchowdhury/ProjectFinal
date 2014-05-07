package com.calculator;

public class FunctionWithReturnType {

	public static void main(String[] args) {
		int a= add(5,5)+20;		
System.out.println("Main Function result"+a);
int d=add(5,5)-20;
System.out.println(d);
	}

public static int add(int a,int b){
	int c=a+b;
	System.out.println(c);
	return c;
	
		
		
	}
	public static void mult(int q,int r, int s, int t){
		int a=q*r*s*t;
		System.out.println(a);
	}

}
