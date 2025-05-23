package br.dev.enzo.tabuada.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.dev.enzo.tabuada.model.Tabuada;

public class TelaTabuada {

	private JLabel labelMultiplicando;
	private JLabel labelmaxMultiplicador;
	private JLabel labelminMultiplicador;
	
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	
	private JButton buttoncalcular;
	private JButton buttonlimpar;
	private JList listTabuada;
	private JScrollPane scrollTabuada;
	private String tituloDaTela;
	
	public void criarTela(String tituloDaTela) {
		
		this.tituloDaTela = tituloDaTela;
		
		JFrame tela = new JFrame();
		tela.setTitle(this.tituloDaTela);
		tela.setSize(260, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		
		// Obtendo a referência do painel de conteúdo da tela
		Container container = tela.getContentPane();
		
		// Cria o label Multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 150, 30);
		
		// Cria o label mínimo multiplicador
		labelminMultiplicador = new JLabel();
		labelminMultiplicador.setText("Mínimo Multiplicador: ");
		labelminMultiplicador.setBounds(20, 60, 150, 30);
		
		// Criar o label máximo multiplicador
		labelmaxMultiplicador = new JLabel();
		labelmaxMultiplicador.setText("Máximo Multiplicador: ");
		labelmaxMultiplicador.setBounds(20, 100, 150, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(180, 20, 50, 30);
		
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(180, 60, 50, 30);
		
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(180, 100, 50, 30);
		
		buttoncalcular = new JButton();
		buttoncalcular.setText("calcular");
		buttoncalcular.setBounds(20, 140, 100, 30);
		
		buttonlimpar = new JButton();
		buttonlimpar.setText("limpar");
		buttonlimpar.setBounds(130, 140, 100, 30);
		
		listTabuada = new JList();

		
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 190, 210, 350);
		
		
		// Adcionando os componentes no Painel de conteúdo do JFrame
		container.add(labelMultiplicando);
		container.add(labelminMultiplicador);
		container.add(labelmaxMultiplicador);
		container.add(textMultiplicando);
		container.add(textMaxMultiplicador);
		container.add(textMinMultiplicador);
		container.add(buttoncalcular);
		container.add(buttonlimpar);
		container.add(scrollTabuada);
		
		// Adicionar ouvintes de ação aos botões
		buttoncalcular.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String multiplicando = textMultiplicando.getText();
				String minMultiplicador = textMinMultiplicador.getText();
				String maxMultiplicador = textMaxMultiplicador.getText();
				
				double multiplicandoDouble = Double.parseDouble(multiplicando);
				double minDouble = Double.parseDouble(minMultiplicador);
				double maxDouble = Double.parseDouble(maxMultiplicador);
				
			    Tabuada tabuada = new Tabuada();
			    tabuada.setMultiplicando(multiplicandoDouble);
			    tabuada.setMinimoMultiplicador(minDouble);
			    tabuada.setMaximoMultiplicador(maxDouble);
			    
			    String[] tabuadaResult = tabuada.mostrarTabuada();
			    listTabuada.setListData(tabuadaResult);
			    
			}
		});
		
		buttonlimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textMultiplicando.setText(null);
				textMinMultiplicador.setText(null);
				textMaxMultiplicador.setText(null);
				listTabuada.setListData(new String[0]);
				textMultiplicando.requestFocus();
			}
		});
		
		
		// Tornar a tela visível deve ser a última instrução.
		tela.setVisible(true);
	}
	
}
