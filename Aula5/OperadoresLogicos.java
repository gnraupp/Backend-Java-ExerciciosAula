package com.stefanini.Aula5;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		/**
		 * 
		 * AND (&&)
		 * V and F = F
		 * V and V = V
		 * F and V = F
		 * F and F = F
		 * 
		 * OR (||)
		 * V or F = V
		 * V or V = V
		 * F or V = V
		 * F or F = F
		 * 
		 * XOR (!=)
		 * V xor F = V
		 * V xor V = F
		 * F xor V = V
		 * F xor F = F
		 * 
		 * Nega��o L�gica (!)
		 * !V => F
		 * !F => V
		 */
		
		boolean v = true;
		boolean f = false;
		
		System.out.println(v && f);
		
	}

}
