package aula1.Model.Caculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Float a, b;
		
		System.out.println("Digite o primeiro valor");
		a = scan.nextFloat();
		System.out.println("Digite o segundo valor");
		b = scan.nextFloat();
		
		Float soma = soma(a,b);
		Float subtracao = subtracao(a,b);
		Float divisao = divisao(a,b);
		Float multiplicacao = multiplicacao(a,b);
	
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicacao);
	}
	public static Float soma (Float a, Float b) {
		return a + b;
	}
	public static Float subtracao (Float a, Float b) {
		return a - b;
	}
	public static Float divisao (Float a, Float b) {
		return a / b;
	}
	public static Float multiplicacao (Float a, Float b) {
		return a * b;
	}
}
