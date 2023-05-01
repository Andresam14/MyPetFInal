package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControladorEscenarios {
	
	private Stage stagePrincipal;
	private AnchorPane anchorpane;

	public ControladorEscenarios(Stage stagePrincipal) {
		super();
		this.stagePrincipal = stagePrincipal;
		cargarInicio();
	}
	
	
	public void cargarInicio() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("InicioFinal.fxml"));
			anchorpane = (AnchorPane) loader.load();
			Scene scene = new Scene(anchorpane);
			stagePrincipal.setScene(scene);
			stagePrincipal.show();
			InicioFinalController c = loader.getController() ;
			c.setControlador(this);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cargarResgistro() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("RegistroCuenta.fxml"));
			anchorpane = (AnchorPane) loader.load();
			Scene scene = new Scene(anchorpane);
			stagePrincipal.setScene(scene);
			RegistroCuentaController c = loader.getController();
			c.setControlador(this);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void guardarRegistro() {
		RegistroCuentaController myclase = new RegistroCuentaController();
		myclase.guardarInformacion();
		
	}
	
	public void cargarMiMascota() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("MiMascota.fxml"));
			anchorpane =  (AnchorPane) loader.load();
			Scene scene = new Scene(anchorpane);
			stagePrincipal.setScene(scene);
			MiMascotaController c = loader.getController();
			c.setControlador(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cargarRegistroMascota1() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("RegistroMascota1.fxml"));
			anchorpane =  (AnchorPane) loader.load();
			Scene scene = new Scene(anchorpane);
			stagePrincipal.setScene(scene);
			RegistroMascota1Controller c = loader.getController();
			c.setControlador(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void cargarRegistroPerro() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("RegistroMascotaPerro.fxml"));
			anchorpane =  (AnchorPane) loader.load();
			Scene scene = new Scene(anchorpane);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stagePrincipal.setScene(scene);
			RegistroMascotaPerroController c = loader.getController();
			c.setControlador(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
