package Tarea3;

public class Ejercicio7 {
	public static void zoop() {
		baffle();
		System.out.print("You wugga ");
		baffle();
	}
	public static void main(String[] args) {
		System.out.print("No, I ");
		zoop();
		System.out.print("I ");
		baffle();
	}
	public static void baffle() {
		System.out.print("wug");
		ping();
	}
	public static void ping() {
		System.out.println(".");
	}
}

/*

1. The output is:

No, I wug.
You wugga wug.
I wug.

2.

main 	["No, I "]
zoop 	[]
baffle	["wug"]
ping	[".\n"]

3.

El programa entra en un loop infinito en donde
se escribe "wug." con salto de linea.
Esto sucede hasta que se llena la memoria
(Stack Overflow)

*/