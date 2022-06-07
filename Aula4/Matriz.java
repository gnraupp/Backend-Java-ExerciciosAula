package com.stefanini.Aula4;

public class Matriz {
	
	public static void main(String[] args) {
		double[][] notas = new double[2][4];

		notas[0][0] = 10;
		notas[0][1] = 7;
		notas[0][2] = 9;
		notas[0][3] = 9.5;
		
		notas[1][0] = 9;
		notas[1][1] = 8;
		notas[1][2] = 7;
		notas[1][3] = 9;
		
		for (int i=0; i<notas.length; i++){
			for (int j=0; j<notas[i].length; j++){
				System.out.print(notas[i][j] + " - ");
			}
			
			System.out.println();
		}
		
		
	}


}
