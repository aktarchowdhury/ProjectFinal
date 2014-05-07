package com.aktar.extend;
import java.util.Scanner;

public class Calculator2 extends CalculatorClass1 {
	public static void main(String[] args) {
		add();
	Scanner John= new Scanner(System.in);
	double Rocky,Sammy,Johnny;
	System.out.println("enter Rocky");
	Rocky=John.nextDouble();
	System.out.println("enter Sammy");
	Sammy=John.nextDouble();
	Johnny=Rocky/Sammy;
	System.out.println(Johnny);
	

	}

}
