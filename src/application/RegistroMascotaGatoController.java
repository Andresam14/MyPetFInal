package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class RegistroMascotaGatoController {
	
	ControladorEscenarios controlador;

	public ControladorEscenarios getControlador() {
		return controlador;
	}

	public void setControlador(ControladorEscenarios controlador) {
		this.controlador = controlador;
	}
	
    @FXML
    void btnBack(ActionEvent event) {
    	controlador.cargarRegistroMascota1();
    }

}
