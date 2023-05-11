package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MiMascotaController {

	ControladorEscenarios controlador;
	
	@FXML
    void btnAgregarMascota(ActionEvent event) {
		controlador.cargarRegistroMascota1();
    }

    @FXML
    void btnContinuar(ActionEvent event) {
    	
    }

    @FXML
    void btnElegirMascota1(ActionEvent event) {
    	controlador.cargarInfoMascotaPerro();
    }
    
    @FXML
    void btnSalir(ActionEvent event) {
    	controlador.cargarInicio();
    }

	public ControladorEscenarios getControlador() {
		return controlador;
	}

	public void setControlador(ControladorEscenarios controlador) {
		this.controlador = controlador;
	}    
}
