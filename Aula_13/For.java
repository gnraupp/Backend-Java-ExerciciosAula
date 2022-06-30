package com.stefanini.Aula_13;

public class For {
	
	public static void main(String[] args) {
		
		//for normal                               // 1� �rea: Inicializa��o
		for (int i = 0; i < 10; i++) {             // 2� �rea: Condi��o
			System.out.println(i);                 // 3� �rea: Atualiza��o
		}
		
		for (int i = 0, j = 10; i < 10; i++, j--) {
			System.out.println("i " + j);
			System.out.println("j " + j);
		}
				
		//for apenas com a condi��o
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


