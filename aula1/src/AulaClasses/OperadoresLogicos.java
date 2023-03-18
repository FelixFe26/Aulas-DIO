package AulaClasses;

public class OperadoresLogicos {
	
	public static void main(String[] args) {

	boolean b1, b2, b3, b4;
	b1 = true;
	b2 = false;
	b3 = true;
	b4 = false;
	
	System.out.println("b1 && b2 " + (b1 && b2));
	System.out.println("b1 && b3 " + (b1 && b3));
	
	System.out.println("b2 || b3 " + (b2 || b3));
	System.out.println("b2 || b4 " + (b2 || b4));
	
	System.out.println("b1 ^ b3 " + (b1 ^ b3));
	System.out.println("b4 ^ b1 " +(b4 ^ b1));
	
	System.out.println("!b1 " +(!b1));
	System.out.println("!b2 "+ (!b2));
	
	int i1, i2;
	i1 = 10;
	i2 = 5;
	
	float f1, f2;
	f1 = 20f;
	f2 = 50f;
	
	System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
	System.out.println("(i1 > i2) || (f2 < f1 " + ((i1 > i2) || (f2 < f1)));
	}
	
}