package br.dev.enzo.tabuada;

import javax.swing.JFrame;

import br.dev.enzo.tabuada.model.Tabuada;

public class Main {

	public static void main(String[] args) {
		
		JFrame tela = new JFrame();
		
		Tabuada tabuada = new Tabuada();
		
		tabuada.setMultiplicando(2);
		tabuada.setMinimoMultiplicador(20);
		tabuada.setMaximoMultiplicador(10);
		tabuada.mostrarTabuada();
		
		Tabuada tabuada2 = new Tabuada();
		
		tabuada2.setMultiplicando(9);
		tabuada2.setMinimoMultiplicador(1);
		tabuada2.setMaximoMultiplicador(10);
		tabuada2.mostrarTabuada();
		
	}

}
