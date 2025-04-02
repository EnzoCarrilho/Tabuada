package br.dev.enzo.tabuada.model;

public class Tabuada {
	
	private double multiplicando;
	private double maximoMultiplicador;
	private double minimoMultiplicador;
	
	public double getMultiplicando() {
		return multiplicando;
	}
	
	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}
	
	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}
	
	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}
	
	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}
	
	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}
	
	public void mostrarTabuada() {
		
		if(minimoMultiplicador > maximoMultiplicador) {
			double troca = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = troca;
		}
		
		System.out.println("Tabuada do " + multiplicando);
		System.out.println();
		
		while(minimoMultiplicador <= maximoMultiplicador) {
			
			double produto = multiplicando * minimoMultiplicador;
			System.out.println(multiplicando + " x " + minimoMultiplicador + " = " + produto);
			minimoMultiplicador ++;
		}
		System.out.println("=====================================");
		System.out.println();
	}
	
}
