package com.aktar.extend;
import java.util.Scanner;

import com.aktar.inherit.JavaInheritence3;

public class CalculatorClass extends JavaInheritence3 {
	public static void main(String[] args) {
		add(456,335);
		calculator(45,5);
	Scanner Ramen= new Scanner(System.in);
	double FirstNumber,SecondNumber,Result;
	System.out.println("Enter FirstNumber");
	FirstNumber= Ramen.nextDouble();
	System.out.println("Enter SecondNumber");
	SecondNumber= Ramen.nextDouble();
	Result=FirstNumber-SecondNumber;
	System.out.println(Result);
	}

}
