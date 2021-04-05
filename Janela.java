import javax.swing.JFrame; // janela
import javax.swing.JLabel; // texto
import javax.swing.JTextField; // caixa de texto
import javax.swing.JButton; // botoes
import java.awt.FlowLayout; // organiza layout
import java.awt.event.ActionEvent; // evento
import java.awt.event.ActionListener; // eventos
import javax.swing.JOptionPane; // para as caixas de dialogo

public class Janela implements ActionListener{
	
	static float result;
	
	static String operador = "";
	
	private static JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btMais, btMenos, btDiv, btMult, btIgual, btClear, btExit;
	
	private static JLabel rotV1, rotV2, rotResult;
	
	private static JTextField campV1, campV2, campResult;
	
	private static Janela criaJ = new Janela();
	
	public static void main(String args[]){
		
		JFrame jan = new JFrame();
		
		int larg = 300, alt = 400;
		
		jan.setSize(larg,alt);
		jan.setTitle("Calculadora");
		
		// Criando componentes
		
		bt1 = new JButton("1");
		bt2 = new JButton("2");
		bt3 = new JButton("3");
		bt4 = new JButton("4");
		bt5 = new JButton("5");
		bt6 = new JButton("6");
		bt7 = new JButton("7");
		bt8 = new JButton("8");
		bt9 = new JButton("9");
		bt0 = new JButton("0");
		btMais = new JButton("+");
		btMenos = new JButton("-");
		btDiv = new JButton("/");
		btMult = new JButton("*");
		btIgual = new JButton("=");
		btClear = new JButton("Clear");
		btExit = new JButton("Exit");
		
		rotV1 = new JLabel();
		rotV2 = new JLabel();
		rotResult = new JLabel();
		
		campV1 = new JTextField(20);
		campV2 = new JTextField(20);
		campResult = new JTextField(25);
		
		rotV1.setText("Valor1");
		rotV2.setText("Valor2");
		rotResult.setText("Resultado");
		
		// Eventos
		
		bt1.addActionListener(criaJ);
		bt2.addActionListener(criaJ);
		bt3.addActionListener(criaJ);
		bt4.addActionListener(criaJ);
		bt5.addActionListener(criaJ);
		bt6.addActionListener(criaJ);
		bt7.addActionListener(criaJ);
		bt8.addActionListener(criaJ);
		bt9.addActionListener(criaJ);
		bt0.addActionListener(criaJ);
		btMais.addActionListener(criaJ);
		btMenos.addActionListener(criaJ);
		btMult.addActionListener(criaJ);
		btDiv.addActionListener(criaJ);
		btIgual.addActionListener(criaJ);
		btClear.addActionListener(criaJ);
		btExit.addActionListener(criaJ);
		campV1.addActionListener(criaJ);
		
		// Adicionando componentes na janela
		
		jan.add(rotV1);
	
		jan.add(campV1);

		jan.add(rotV2);
	
		jan.add(campV2);
		
		jan.add(rotResult);
		
		jan.add(campResult);
		
		jan.add(bt1);
		jan.add(bt2);
		jan.add(bt3);
		jan.add(bt4);
		jan.add(bt5);
		jan.add(bt6);
		jan.add(bt7);
		jan.add(bt8);
		jan.add(bt9);
		jan.add(bt0);
		jan.add(btMais);
		jan.add(btMenos);
		jan.add(btMult);
		jan.add(btDiv);
		jan.add(btIgual);
		jan.add(btClear);
		jan.add(btExit);
		
		
		
		jan.setLayout(new FlowLayout());
		
		jan.setVisible(true);
		
		jan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}		
		public float calcular(String v1, String v2) throws ArithimectException, NegaException, NumberFormatException{
			
			if(Float.parseFloat(v2) == 0 && operador.equals("/")){
				
				throw new ArithimectException();
				
			}
			
			try{
			
				if(operador.equals("+")){
					result = Float.parseFloat(v1) + Float.parseFloat(v2);
				}
				
				else if(operador.equals("-")){
					result = Float.parseFloat(v1) - Float.parseFloat(v2);
				}
				
				else if(operador.equals("*")){
					result = Float.parseFloat(v1) * Float.parseFloat(v2);
				}
				
				else if(operador.equals("/")){
					result = Float.parseFloat(v1) / Float.parseFloat(v2);
				}
			}
			
			catch(NumberFormatException nfE){
				JOptionPane.showMessageDialog(null, "(ERRO) Valores invalidos!");
				campV1.setText("");
				campV2.setText("");
				campV1.requestFocus();	
			}
			
			
			
			if(result < 0){
				
				throw new NegaException();
				
			}
			
			System.out.println("Resultado: " + result);
			
			return result;
		}
		
		
		public void actionPerformed(ActionEvent evento){

			Object obj = evento.getSource();
			
			if(obj.equals(bt1)){ // se clicar no botao 1
				 
				 if(operador.equals("")){
					 
					campV1.setText(campV1.getText() + "1");
					
				 }
				 
				 else{
						campV2.setText(campV2.getText() + "1");
		
				 }
			}	
			
			else if(obj.equals(bt2)){ // se clicar no botao 2
				
				if(operador.equals("")){
					campV1.setText(campV1.getText() + "2");
				}
				 
				 else{
						campV2.setText(campV2.getText() + "2");
				 }
			}
			
			else if(obj.equals(bt3)){ // se clicar no botao 3
			
				 if(operador.equals("")){
					campV1.setText(campV1.getText() + "3");
				}
				 
				 else{
						campV2.setText(campV2.getText() + "3");
				 }
			}
			
			else if(obj.equals(bt4)){ // se clicar no botao 4
			
				if(operador.equals("")){
					campV1.setText(campV1.getText() + "4");
				}
				 
				else{
						campV2.setText(campV2.getText() + "4");
				 }
			}
			
			else if(obj.equals(bt5)){ // se clicar no botao 5
			
				if(operador.equals("")){
					campV1.setText(campV1.getText() + "5");
				}
				 
				else{
						campV2.setText(campV2.getText() + "5");
				}
			}
			
			else if(obj.equals(bt6)){ // se clicar no botao 6
			
				if(operador.equals("")){
					campV1.setText(campV1.getText() + "6");
				}
				 
				else{
						campV2.setText(campV2.getText() + "6");
				 }
			}
			
			else if(obj.equals(bt7)){ // se clicar no botao 7
				
				if(operador.equals("")){
					campV1.setText(campV1.getText() + "7");
				}
				 
				else{
						campV2.setText(campV2.getText() + "7");
				}
			}
			
			else if(obj.equals(bt8)){ // se clicar no botao 8
			
				if(operador.equals("")){
					campV1.setText(campV1.getText() + "8");
				}
				 
				else{
						campV2.setText(campV2.getText() + "8");
				}
			}
			
			else if(obj.equals(bt9)){ // se clicar no botao 9
			
				if(operador.equals("")){
					campV1.setText(campV1.getText() + "9");
				}
				 
				else{
						campV2.setText(campV2.getText() + "9");
				}
			}
			
			else if(obj.equals(bt0)){ // se clicar no botao 0
			
				if(operador.equals("")){
					campV1.setText(campV1.getText() + "0");
				}
				 
				else{
						campV2.setText(campV2.getText() + "0");
				}
			}
			
			else if(obj.equals(btExit)){ // se clicar no botao exit
				 System.exit(1);
			}
			
			else if(obj.equals(btMais)){ // se clicar no botao mais
				 operador = "+";
				 campV2.requestFocus();
			}
			
			else if(obj.equals(btMenos)){ // se clicar no botao menos
				 operador = "-";
				 campV2.requestFocus();
			}
			
			else if(obj.equals(btMult)){ // se clicar no botao mult
				 operador = "*";
				 campV2.requestFocus();
			}
			
			else if(obj.equals(btDiv)){ // se clicar no botao div
				 operador = "/";
				 campV2.requestFocus();
			}
			
			else if(obj.equals(btIgual)){ // se clicar no botao igual
			
				if(campV1.getText().equals("") || campV2.getText().equals("")){
					JOptionPane.showMessageDialog(null, "(AVISO) Campo vazio!");
					campV1.setText("");
					campV2.setText("");
					campV1.requestFocus();
				}
				
				else{
			
					try{
						campResult.setText(String.valueOf(calcular(campV1.getText(), campV2.getText())));
					}
					
					catch(ArithimectException arE){
						arE.msgErro();
						campV2.setText("");
						campV2.requestFocus();
					}
					
					catch(NegaException nE){
						nE.msgErro();
						campV1.setText("");
						campV2.setText("");
						campResult.setText("");
						campV1.requestFocus();
					}
				}
			}
			
			else if(obj.equals(btClear)){
				 campV1.setText("");
				 campV2.setText("");
				 campResult.setText("");
				 result = 0;
				 operador = "";
				 campV1.requestFocus();
			}
		} 
			
	}