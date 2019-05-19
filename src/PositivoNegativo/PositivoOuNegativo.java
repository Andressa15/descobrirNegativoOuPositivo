package PositivoNegativo;

import java.util.Scanner;

public class PositivoOuNegativo {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 

		System.out.println(" Digite um numero e descubra");
		float flow = scan.nextFloat();
		if ( flow > 0) {
			System.out.println("Positivo");
		} else {
			System.out.println(" é negativo");
		}

	}
}
