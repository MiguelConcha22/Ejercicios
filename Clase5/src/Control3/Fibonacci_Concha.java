package Control3;

import java.util.Scanner;

public class Fibonacci_Concha {

	private static Scanner in;

	public static void main(String[] args) {
		int numero;
		in = new Scanner(System.in);
		
		System.out.print("Ingresevalor a calcular: ");
		numero = in.nextInt();
		
		System.out.printf("El resultado es: %d", fibonacci(numero));
	}
	
	public static long fibonacci(int n) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else if(n > 1) {
			return fibonacci(n-1) + fibonacci(n-2);
		}else {
			System.out.println("Ingresa un número positivo");
			return -1;
		}
	}
}

/*

	No pude probar con F(60), ya que con F(50) el computador no entregó
	un resultado debido a que se requerían hacer demasiadas recursiones,
	por lo que el computador no logra hacer el cálculo en un tiempo corto.

*/