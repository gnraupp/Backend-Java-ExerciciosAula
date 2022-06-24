package com.stefanini.Aula_12;

public class Loop {
	
	public static void main(String[] args) {
		int count = 101;
		
		while (count < 100) {
			System.out.println("count: " + count);
			count++;
		}
		
		int countDois = 101;
		
		do {
			System.out.println(countDois); // -> executa pelo menos um vez se a condição for falsa
			countDois++;
		} while(countDois < 100);
		
		//for normal
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		//for com areas ausentes 
		int i = 0;
		
		for (; i < 100;) {
			System.out.println(i);
			i++;
		}
		
		//for com todas as areas ausentes -> loop infinito 
		for (;;) {
			System.out.println("for");
		}
		
	}

}
