package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MascotaPerroController {
	
	ControladorEscenarios controlador;

	public ControladorEscenarios getControlador() {
		return controlador;
	}

	public void setControlador(ControladorEscenarios controlador) {
		this.controlador = controlador;
	}
	
    @FXML
    void btnAgregarImage(ActionEvent event) {

    }

    @FXML
    void btnBack(ActionEvent event) {
    	controlador.cargarMiMascota();
    }

    @FXML
    void btnIndSalud(ActionEvent event) {
    	
    }

    @FXML
    void btnRegistroMedico(ActionEvent event) {
    	
    }
}
