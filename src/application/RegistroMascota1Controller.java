package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;

public class RegistroMascota1Controller implements Initializable{
	
	ControladorEscenarios controlador;

	public ControladorEscenarios getControlador() {
		return controlador;
	}

	public void setControlador(ControladorEscenarios controlador) {
		this.controlador = controlador;
	}
	
	@FXML
	private ChoiceBox<String> tipoMascota;
	@FXML
	private String[] pets = {"Perro", "Gato", "Hamster", "Loro"};
	
	@FXML
	void btnContnu(ActionEvent event) {
		ObtenerInfoChoiceBox();
	}
	
	@FXML
	void btnBack(ActionEvent event) {
		controlador.cargarMiMascota();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		tipoMascota.getItems().addAll(pets);
		
	}
		
	public void ObtenerInfoChoiceBox() {
		if(tipoMascota.getValue() == "Perro"){
			controlador.cargarRegistroPerro();
		}
		else if(tipoMascota.getValue() == "Gato") {
			controlador.cargarInicio();
		}	
	}
	
}
