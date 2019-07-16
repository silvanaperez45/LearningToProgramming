package Practice;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		//Random numbers
//		Random ran = new Random();
//	    int a = ran.nextInt(100);
//	    int b = ran.nextInt(100);
    
	    
		
		/*Entering integers and Strings*/
		Scanner scn = new Scanner(System.in);
		System.out.print("Welcome, enter your name:");
		String name = scn.next();
		System.out.print("Enter the first number, and press enter: " );
		int a = scn.nextInt();
		System.out.print("Enter the symbol for the operation:  ");
		String c = scn.next();
		System.out.print("Enter the second number, and press enter: " );
		int b = scn.nextInt();
//		System.out.println("Enter the corresponding number for the operation: Addition(1), Substraction(2), multiplication(3), Division(4)");
//		int c = scn.nextInt();

		
	    /*
	     * Calculator
	     */
		Operations op = new Operations();
		if(c.equals("+")){
			System.out.println("A + B = " + op.add(a, b));
		}else if(c.equals("-")){
			System.out.println("A - B = " + op.sub(a, b));
		}else if(c.equals("*")){
			System.out.println("A * B = " + op.mul(a, b));
		}else if(c.equals("/")){
			if(b==0){			
				System.out.println(name +" C'mon!!! Division by cero isn´t possible because tend to infinite.");
			}else{
				System.out.println("A / B = " + op.div(a, b));
			}
		}
	}

		
	    /*
	     * Calculator
	     */
//		Operations op = new Operations();
//		switch(c){
//		case 1:
//		System.out.println("A + B = " + op.add(a, b));
//		break;
//		case 2:
//		System.out.println("A - B = " + op.sub(a, b));
//		break;
//		case 3:
//		System.out.println("A * B = " + op.mul(a, b));
//		break;
//		case 4:
//		System.out.println("A / B = " + op.div(a, b));
//		break;
//		}
		
//		/*
//		 * Major to or Equal numbers
//		 */
//		if(a>b){
//			System.out.println("The major number is: "+ a);
//		} else if(b>a){
//			System.out.println("The major number is: "+ b);
//		}else{
//			System.out.println("Both numbers are equal  "+ "a="+ a +" and "+"b="+ b);
//		}
		

	}


