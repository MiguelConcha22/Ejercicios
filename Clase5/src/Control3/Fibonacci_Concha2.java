package Control3;

import java.util.Scanner;

public class Fibonacci_Concha2 {

	public static void main(String[] args) {		
		int numero;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ingresevalor a calcular: ");
		numero = in.nextInt();
		
		long[] listaFibonacci = new long[numero + 1];
		
		for(int i = 0; i <= numero; i++) {
			listaFibonacci[i] = fibonacci(i, listaFibonacci);
		}
		
		System.out.printf("El resultado es: %d", listaFibonacci[numero]);
	}
	
	public static long fibonacci(int n, long[] listaFibonacci) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else if(n > 1) {
			return listaFibonacci[n-1] + listaFibonacci[n-2];
		}else {
			System.out.println("Ingresa un número positivo");
			return -1;
		}
	}
}

/*

Con F(60), F(70) y F(80), a diferencia de con el código anterior, lo 
calcula un tiempo corto de tiempo y entrega el resultado.

*/