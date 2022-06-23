package com.stefanini.Aula10;

public class BMW extends Carro {
	
	@Override
	public double calcularTaxaAceleracao(double VelocidadeFinal, double tempoFinal) {
		System.out.println("sobrescrita");
		return VelocidadeFinal / tempoFinal;
	}

}
