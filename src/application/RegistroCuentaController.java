package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistroCuentaController {

	ControladorEscenarios controlador;
	
	@FXML
    private Label labelCuentaCreada;
	
    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtNombre;

    @FXML
    private PasswordField txtPass;

    @FXML
    private PasswordField txtPassConfirmed;    
    
	@FXML
    void btnCrearCuenta(ActionEvent event) {
		if(validarCamposLlenos()) {
			controlador.cargarMiMascota();
		} else {
			labelCuentaCreada.setText("POR FAVOR DILIGENCIE TODOS LOS CAMPOS");
		}
		
		
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
		
	public boolean validarCamposLlenos() {
		if(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCelular.getText().isEmpty() || txtCorreo.getText().isEmpty()
				|| txtPass.getText().isEmpty() || txtPassConfirmed.getText().isEmpty()) {
			labelCuentaCreada.setText("POR FAVOR DILIGENCIE TODOS LOS CAMPOS");
			return false;
		} else {
			labelCuentaCreada.setText("SU CUENTA HA SIDO CREADA CON EXITO");
			return true;
		}
		
	}
	
	
}
