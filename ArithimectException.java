import javax.swing.JOptionPane;

public class ArithimectException extends Exception{

	public void msgErro(){
		
		JOptionPane.showMessageDialog(null,"ERRO! Nao existe divisao por zero! ");
		
	}
}