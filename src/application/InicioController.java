package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

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
    
	public void InicioSesion() {
		
	}
    
}
