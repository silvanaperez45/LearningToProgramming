package co.com.calculator.entidades;

import java.util.Scanner;

public class Calculator{
	
	Scanner scn = new Scanner(System.in);
	Operations op = new Operations();
	
	public float calculations (){

	System.out.print("First number: ");     
	int a = scn.nextInt();
	System.out.print("Operator:  ");
	String c = scn.next();
	System.out.print("Second Number: ");
	int b = scn.nextInt();
		
	float result = 0;
	if (c.equals("+")) {
		result = op.add(a, b);
		System.out.println("A + B = " + result +"\n");
	} else if (c.equals("-")) {
		result = op.sub(a, b);
		System.out.println("A - B = " +result +"\n");
	} else if (c.equals("*")) {
		result = op.mul(a, b);
		System.out.println("A * B = " + result +"\n");
	} else if (c.equals("/")) {
		if (b == 0) {
			System.out.println("Division by cero tend to infinite.");
		} else {
			result = op.div(a, b);
			System.out.println("A / B = " + result);
		}
	}else if(c!="+"&&c!="-"&&c!="*"&&c!="/"){
		System.out.println("Must be a valid Operator");
	}
	
	return result;
  }
}


