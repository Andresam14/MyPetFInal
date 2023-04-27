package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class RegistroCuentaController {

	ControladorEscenarios controlador;
	
	@FXML
    void btnCrearCuenta(ActionEvent event) {
		System.out.println("Su cuenta ha sido creada con Exito");
    }
	
	@FXML
    void btnBack(ActionEvent event) {
		controlador.cargarInicio();
    }

	public ControladorEscenarios getControlador() {
		return controlador;
	}

	public void setControlador(ControladorEscenarios controlador) {
		this.controlador = controlador;
	}
	
	
	
}
