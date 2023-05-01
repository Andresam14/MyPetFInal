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
    
    private String nombre, apellido, celular,  correo,  password,  confirmedPassword;
    
    
    
	@FXML
    void btnCrearCuenta(ActionEvent event) {
		validarCamposLlenos();
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
		
	public void validarCamposLlenos() {
		if(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCelular.getText().isEmpty() || txtCorreo.getText().isEmpty()
				|| txtPass.getText().isEmpty() || txtPassConfirmed.getText().isEmpty()) {
			labelCuentaCreada.setText("POR FAVOR DILIGENCIE TODOS LOS CAMPOS");
		} else {
			guardarInformacion();
			labelCuentaCreada.setText("SU CUENTA HA SIDO CREADA CON EXITO");
		}
		
	}
	
	public void guardarInformacion() {
		nombre = txtNombre.getText();
		apellido = txtApellido.getText();
		celular = txtCelular.getText();
		correo = txtCorreo.getText();
		password = txtPass.getText();
		confirmedPassword = txtPassConfirmed.getText();
		
	}
	
}
