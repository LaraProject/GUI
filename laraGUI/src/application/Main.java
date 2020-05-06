package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	String Lara; // identité de l'interlocuteur
	String view = "ChatFrame.fxml";
	String username = "Anna"; // à changer avec la fenêtre d'accueil
	// les autres variables utiles sont définies dans le controller HomepageCtrl
	
	@Override
	public void start(Stage primaryStage) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getClassLoader().getResource(view));
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void chooseLara(String identity) { // à voir pour remplacer le reste
		Lara = identity;
		//HomepageCtrl.chatBox = "";
	}
	
	
}
