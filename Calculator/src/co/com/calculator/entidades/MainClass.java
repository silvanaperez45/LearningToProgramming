package co.com.calculator.entidades;

import java.util.Scanner;

import co.com.calculator.util.Propiedades;

public class MainClass {
	
	public static final String ANSI_BLUE = "\u001B[34m";
	
	public static void main(String[] args) {
		int option;

		do {

			System.out.println(Propiedades.get(Propiedades.KEY_MENU_PRINCIPAL));
			System.out.println(Propiedades.get(Propiedades.KEY_MAIN_OPC));
			System.out.println(Propiedades.get(Propiedades.KEY_OPC_CLC));
			System.out.println(Propiedades.get(Propiedades.KEY_OPC_EXT));
			
						
			Scanner scn = new Scanner(System.in);
			option = scn.nextInt();

			switch (option) {

			case 1:
				// Calculator
				System.out.print("First number: ");
				int a = scn.nextInt();
				System.out.print("Operator:  ");
				String c = scn.next();
				System.out.print("Second Number: ");
				int b = scn.nextInt();
				Operations op = new Operations();
				if (c.equals("+")) {
					System.out.println("A + B = " + op.add(a, b)+"\n");
				} else if (c.equals("-")) {
					System.out.println("A - B = " + op.sub(a, b)+"\n");
				} else if (c.equals("*")) {
					System.out.println("A * B = " + op.mul(a, b)+"\n");
				} else if (c.equals("/")) {
					if (b == 0) {
						System.out
								.println("Division by cero tend to infinite.");
					} else {
						System.out.println("A / B = " + op.div(a, b));
					}
				}
				break;

			case 2:
				System.out.print("Good Bye!");
				break;

			default:
				System.out.println("Invalid Option"+"\n");
			}
		} while (option != 2);
	}
}
