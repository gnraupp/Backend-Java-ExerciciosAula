package orienta��o_a_objetos_Entidades;

import orienta��o_a_objetos.Carro;
import orienta��o_a_objetos.Conversivel;
import orienta��o_a_objetos.Esportivo;
import orienta��o_a_objetos.Utilitario;

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
