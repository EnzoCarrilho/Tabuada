package br.dev.enzo.tabuada.model;

import java.util.List;
import java.util.Vector;

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
	
	public String[] mostrarTabuada() {
		
		if(minimoMultiplicador > maximoMultiplicador) {
			double troca = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = troca;
		}
		
		// Criando o vetor que vai guardar a Tabuada
		// Cada elemento do vetoe será uma linha da Tabuada
		
		int tamanhoTabuada = (int) (maximoMultiplicador - minimoMultiplicador + 1);
		
		String[] tabuada = new String[tamanhoTabuada];
		
		int i = 0;
		while(minimoMultiplicador <= maximoMultiplicador) {
			
		    double produto = multiplicando * minimoMultiplicador;
			tabuada[i] = multiplicando + " x " + minimoMultiplicador + " = " + produto;
			minimoMultiplicador ++;
			i++;
		}
		
		return tabuada;
		
	}
	
}
