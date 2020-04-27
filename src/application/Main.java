package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) throws Exception{
		
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("formulario.fxml"));
			Scene scene = new Scene(root);
			
			stage.setScene(scene);
			stage.show();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
