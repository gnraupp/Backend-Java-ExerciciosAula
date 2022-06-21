package com.stefanini.OrientacaoObjetos.entidade;

import com.stefanini.OrientacaoObjetos.Carro;

public class BMW extends Carro {
	
	public BMW() {
		this.setMarca("BMW");
		
	}
	
	public String acelerar() {
		return "A BMW pode fazer de 0 a " + this.getVelocidade() + " em 5s";
	}

}
