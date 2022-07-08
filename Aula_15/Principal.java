package orientação_a_objetos;

import orientação_a_objetos_Entidades.BMW;
import orientação_a_objetos_Entidades.Tesla;

public class Principal {
	static int valor = 10;
	
	static void print() {
		System.out.println(valor);
	}

	public static void main(String[] args) {
		valor = 10;
		print();
		
		/*Carro bmw = new Carro();
		bmw.setMarca("BMW");
	    bmw.setModelo("M3");
	    bmw.setQuilometrosPorLitro(7.5);
	    bmw.setVelocidadeMaxima(280);
	    
	    Carro mercedes = new Carro("Mercedes", "c180");*/
	    
	    BMW bmwDois = new BMW();
	    Tesla tesla = new Tesla();
	    tesla.isDirigeSozinho();
	    bmwDois.PiscarAlerta();
	    
	    BMW bmwTres = null;
	    
	    //bmwTres.acelerar();
	    
	    try {
	    	bmwDois.setVelocidadeMaxima(10);
	    } catch(NegocioException e) {
	    	System.out.println(e);
	    } finally {
	    	System.out.println("passou aqui");
	    }
	    
	    Carro teslaDois = new Tesla();
	    ((Tesla) teslaDois).setDirigeSozinho(true);
	    System.out.println(((Tesla) teslaDois).isDirigeSozinho());
	    teslaDois.PiscarAlerta();
	    
	    Carro[] carros = new Carro[] {bmwDois, tesla, teslaDois};
	    
	    for (Carro carro: carros) {
	    	if (Constantes.MARCA_FAMOSA.equals(carro.getMarca())) {
	    		System.out.println("Carro de marca famosa");
	    	}
	    	if (carro instanceof Tesla) {
	    		System.out.println(((Tesla)carro).isDirigeSozinho());
	    	}
	    }
	    
	    Calcular.soma(0, 0);
	    
	    //Constantes.MARCA_FAMOSA = "Porsche";
	    
	    bmwDois.calcularTaxaAceleracao(100.5, 10);
	    tesla.calcularTaxaAceleracao(100.5, 10);

	}
	
}
