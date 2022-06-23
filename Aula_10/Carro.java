package com.stefanini.Aula10;

public class Carro {
	/*
	   Modificadores de acesso 
	   default => não tem uma palavra chava (reservada). Acessível apenas a própria classe ou a classe de um mesmo pacote.
	   public => Acessível a própria classe, classe de um mesmo pacote, subclasses (extends), e todas as demais classes.
	   private => Acessível apenas a própria classe.
	   protected => Acessível a própria classe, classe de um mesmo pacote e subclasses (extends).
	*/
	
	private String marca;
	private String modelo;
	private int velocidadeMaxima;
	private int taxaAcelaracao;
	private double quilometrosPorLitro;
	
	public Carro() {
		System.out.println("Construindo Carro...");
	}
	
	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void acelerar() {
		System.out.println("Acelerando...");
	}
	
	public void frear() {
		System.out.println("Freando...");
	}
	
	public double calcularTaxaAceleracao(double VelocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial) {
		return (VelocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial) * 3.6;
	}
	
	public double calcularTaxaAceleracao(double VelocidadeFinal, double tempoFinal) {
		return (VelocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
	}
	
	public String calcularTaxaAceleracao(int VelocidadeFinal, int tempoFinal) {
		return "" + (VelocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		if (velocidadeMaxima < 0) {
			System.out.println("Valor é inválido");
		} else { 
		    this.velocidadeMaxima = velocidadeMaxima;
		}
	}

	public int getTaxaAcelaracao() {
		return taxaAcelaracao;
	}

	public void setTaxaAcelaracao(int taxaAcelaracao) {
		this.taxaAcelaracao = taxaAcelaracao;
	}

	public double getQuilometrosPorLitro() {
		return quilometrosPorLitro;
	}

	public void setQuilometrosPorLitro(double quilometrosPorLitro) {
		this.quilometrosPorLitro = quilometrosPorLitro;
	}
	
	

}
