package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.gluonhq.charm.glisten.control.TextField;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class FormularioController implements Initializable{
	

	    @FXML
	    private Button Botaosair;
	    @FXML
	    private TextField Email;
	    @FXML
	    private PasswordField Senha;
	    
	    @FXML
	    public void validar(){
	    	
	    	String nome = Email.getText();
	    	String senha = Senha.getText();
	    	
	    	if(nome.isEmpty() || senha.isEmpty()) {
	    		Alert alert = new Alert(Alert.AlertType.ERROR);
	    		alert.setHeaderText(null);
	    		alert.setContentText("POR FAVOR ENSIRA OS DADOS");
	 	        alert.show();
	    	}
	    	else {
	    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
	   	     
		        alert.setContentText("LOGIN FEITO COM SUCESSO");
		        alert.show();
	    	}
	    }
	    
	    @FXML
	    public void AcaoBotaoSair(){
	    	System.exit(0);
	    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
