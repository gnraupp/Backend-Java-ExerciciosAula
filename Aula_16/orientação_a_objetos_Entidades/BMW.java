package orientação_a_objetos_Entidades;

import orientação_a_objetos.Carro;
import orientação_a_objetos.Conversivel;
import orientação_a_objetos.Esportivo;
import orientação_a_objetos.Utilitario;

public class BMW extends Carro implements Conversivel, Utilitario {
	
	public BMW() {
		super();
	}
	
	@Override
	public double calcularTaxaAceleracao(double VelocidadeFinal, double tempoFinal) {
		System.out.println("BMW sobrescrita");
		return VelocidadeFinal / tempoFinal;
	}

	@Override
	public void PiscarAlerta() {
		System.out.println("BMW piscando alerta...");
		
	}

	@Override
	public void acionarTurbo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void passear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abrirCapo() {
		// TODO Auto-generated method stub
		
	}

}
