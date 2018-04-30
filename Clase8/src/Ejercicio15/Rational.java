package Ejercicio15;

public class Rational {
	int numerator;
	int denominator;
	
	public Rational() {
		this.numerator = 0;
		this.denominator = 0;
	}
	
	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void printRational() {
		System.out.println("El numero es: " + this.numerator + "/" + this.denominator);
	}
	
	public String toString(Rational rational) {
		String mensaje = rational.numerator + "/" + rational.denominator;
		return mensaje;
	}
	
	public void negate() {
		this.numerator = this.numerator * -1;
	}
	
	public void invert() {
		if(this.numerator != 0) {
			if(this.numerator > 0) {
				int temp = this.numerator;
				this.numerator = this.denominator;
				this.denominator = temp;
			}else {
				int temp = this.numerator;
				this.numerator = this.denominator * -1;
				this.denominator = temp * -1;
			}
		}else
			System.out.println("No se puede tener denominador = 0");
	}
	
	public double toDouble(Rational rational) {
		double decimal = ((double)rational.numerator)/((double)rational.denominator);
		return decimal;
	}
	
	public int gcd(int numerator, int denominator) {
        if (denominator == 0) {
        	if(numerator >= 0)
        		return numerator;
        	else
        		return numerator * -1;
        }else
        	return gcd(denominator, numerator % denominator);
    }
	
	public Rational reduce(Rational rational) {
		int GCD = rational.gcd(this.numerator, this.denominator);
		rational.numerator = this.numerator/GCD;
		rational.denominator = this.denominator/GCD;
		return rational;
	}
	
	public Rational add(Rational rational) {
		int tempD = rational.denominator;
		
		rational.numerator = rational.numerator * this.denominator;
		rational.denominator = rational.denominator * this.denominator;
		
		this.numerator = this.numerator * tempD;
		this.denominator = this.denominator * tempD;
		
		rational.numerator = rational.numerator + this.numerator;
		
		rational = rational.reduce(rational);
		
		return rational;
	}
	
	public static void main(String[] args) {
		Rational test = new Rational();
		test.numerator = 6;
		test.denominator = 10;
		test.printRational();
		System.out.println(test.toString(test));
		
		test.negate();
		test.printRational();
		
		test.invert();
		test.printRational();
		
		System.out.println(test.toDouble(test));
		
		Rational reduce = new Rational(test.numerator, test.denominator);
		
		reduce = test.reduce(reduce);
		test.printRational();
		reduce.printRational();
		
		Rational sumar = new Rational(4, 7);
		Rational result = new Rational();
		result = test.add(sumar);
		result.printRational();
	}
}
