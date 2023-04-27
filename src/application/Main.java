package application;
	
import javax.print.attribute.standard.JobHoldUntil;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		new ControladorEscenarios(primaryStage);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}