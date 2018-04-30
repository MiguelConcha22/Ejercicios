package Ejercicio15;

public class Tile {
	char letter;
	int value;
	
	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}
	
	public void printTile(Tile tile) {
		System.out.println("La letra solicitada es: " + tile.letter);
		System.out.println("Que tiene un valor de: " + tile.value);
	}
	
	public void testTile() {
		Tile z = new Tile('z', 10);
		printTile(z);
	}
	
	public String toString() {
		String mensaje = "Esta es la letra: " + this.letter + "con valor: " + this.value;
		return mensaje;
	}
	
	public boolean equals(Tile tile) {
		if(tile.letter == this.letter && tile.value == this.value)
			return true;
		else
			return false;
	}
	
	public char getLetter() {
		return this.letter;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setLetter(char letter) {
		this.letter = letter;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
