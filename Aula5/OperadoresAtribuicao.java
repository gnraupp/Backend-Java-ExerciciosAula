package com.stefanini.Aula5;

public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
		int a = 10; // operador de atribuição
		int b = 5;
		
		b += a; // aditivo (b = b + a)
		b -= a; // substrativo
		b *= a; // multiplicativo
		b /= a; // divisivo
		b %= a; // modular
		
		System.out.println(a % b);
	}

}
