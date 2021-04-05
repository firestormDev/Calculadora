import javax.swing.JOptionPane;

public class NegaException extends Exception{
	
	public void msgErro(){
		JOptionPane.showMessageDialog(null, "(AVISO) Resultado negativo!");
	}

}