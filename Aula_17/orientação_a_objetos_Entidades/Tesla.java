package orientação_a_objetos_Entidades;

import orientação_a_objetos.Carro;

public class Tesla extends Carro {
	
	private boolean dirigeSozinho;
	
	public Tesla() {
		super();
	}
	
	@Override
	public double calcularTaxaAceleracao(double VelocidadeFinal, double tempoFinal) {
		System.out.println("Tesla sobrescrita");
		return VelocidadeFinal * tempoFinal;
	}

	public boolean isDirigeSozinho() {
		return dirigeSozinho;
	}

	public void setDirigeSozinho(boolean dirigeSozinho) {
		this.dirigeSozinho = dirigeSozinho;
	}

}
