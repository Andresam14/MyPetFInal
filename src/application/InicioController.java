package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class InicioController {
	
	ControladorEscenarios controlador;
	
	@FXML
    void btnInicioSesion(ActionEvent event) {
		controlador.cargarMiMascota();
    }
	
	@FXML
    void btnRegistro(ActionEvent event) {
		controlador.cargarResgistro();
    }

	@FXML
	void btnOlvidoContra(ActionEvent event) {
		
	}

	public ControladorEscenarios getControlador() {
		return controlador;
	}

	public void setControlador(ControladorEscenarios controlador) {
		this.controlador = controlador;
	}
    
    
}
