package ej8;

import java.util.Scanner;

public class Entrada {

	public static String leerString() {
		String cadena;
		Scanner sc = new Scanner(System.in);
		cadena = sc.nextLine();
		sc.close();
		return cadena;
	}
	
	public static int leerInt() {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		return num;
	}
	
	public static double leerDouble() {
		double real;
		Scanner sc = new Scanner(System.in);
		real = sc.nextInt();
		sc.close();
		return real;
	}
	
	public static char leerChar() {
		char c;
		String aux;
		Scanner sc = new Scanner(System.in);
		aux = sc.nextLine();
		c = aux.charAt(0);
		sc.close();
		return c;
	}
}
