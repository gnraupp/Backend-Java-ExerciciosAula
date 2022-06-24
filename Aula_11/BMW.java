package com.stafanini.Aula11;

public class BMW extends Carro {
	
	public BMW() {
		super();
	}
	
	@Override
	public double calcularTaxaAceleracao(double VelocidadeFinal, double tempoFinal) {
		System.out.println("BMW sobrescrita");
		return VelocidadeFinal / tempoFinal;
	}

}
