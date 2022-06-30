package com.stefanini.Aula_13;

public class For {
	
	public static void main(String[] args) {
		
		//for normal                               // 1º área: Inicialização
		for (int i = 0; i < 10; i++) {             // 2º área: Condição
			System.out.println(i);                 // 3º área: Atualização
		}
		
		for (int i = 0, j = 10; i < 10; i++, j--) {
			System.out.println("i " + j);
			System.out.println("j " + j);
		}
				
		//for apenas com a condição
		int i = 0;
				
		for (; i < 10;) {
		    System.out.println(i);
		    i++;
		}
				
		//for loop infinito 
		for (;;) {
			System.out.println("loop infinito");
		}
				
			}
	}


