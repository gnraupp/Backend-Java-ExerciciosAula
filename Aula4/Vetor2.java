package com.stefanini.Aula4;

public class Vetor2 {

	public static void main(String[] args) {
		String[] carros = new String[]{"BMW i320", "Mercedes c180", "BMW M3", "Mercedes AMG", "Tesla Model S"};
		
		System.out.println(carros.length);
		
		for (String carro : carros) {
			System.out.println(carro);
			
		}
	}
}
