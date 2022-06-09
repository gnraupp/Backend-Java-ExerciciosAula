package com.stefanini.Aula5;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		int soma = 10 + 5;
		int subtracao = 10 - 5;
		int multiplicacao = 10 * 5; // infix
		int divisao = 10 / 5;
		int modulo = 10 % 5;
		
		int a = 10;
		
		// a++ // postfix 
		// ++a // prefix (maior precedência)
		
		System.out.println(++a == 11);
	}

}
