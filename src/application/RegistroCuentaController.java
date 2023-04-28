package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistroCuentaController {

	ControladorEscenarios controlador;
	
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
    
    private String nombre, apellido, celular, correo, password, confirmedPassword;
    
	@FXML
    void btnCrearCuenta(ActionEvent event) {
		if(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCelular.getText().isEmpty() || txtCorreo.getText().isEmpty()
				|| txtPass.getText().isEmpty() || txtPassConfirmed.getText().isEmpty()) {
			System.out.println("DIligenciar todos los campos");
		} else {
			System.out.println("Cuenta creada con exito");
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
	
	public void verificarNombre() {
		
	}
	
}
