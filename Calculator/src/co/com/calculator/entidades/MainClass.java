package co.com.calculator.entidades;

import java.util.Scanner;

import co.com.calculator.util.Propiedades;

public class MainClass {
	
	public static void main(String[] args) {
		int option;
		do {

			System.out.println(Propiedades.get(Propiedades.KEY_MENU_PRINCIPAL));
			System.out.println(Propiedades.get(Propiedades.KEY_OPC_CLC));
			System.out.println(Propiedades.get(Propiedades.KEY_OPC_EXT));
			
			Scanner scn = new Scanner(System.in);			
			option = scn.nextInt();

			switch (option) {
			
			case 1:
				Calculator clc = new Calculator();
				float result = clc.calculations();
				System.out.print(Propiedades.get(Propiedades.KEY_OPC_CNT));
				do{
					float Total = result + clc.calculations();
					System.out.println(Total);
					option = scn.nextInt();
				}while(option==3);
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
