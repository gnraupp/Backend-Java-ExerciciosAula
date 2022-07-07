package orientação_a_objetos_Entidades;

import orientação_a_objetos.Carro;

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
