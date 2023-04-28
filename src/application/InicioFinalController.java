package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class InicioFinalController implements Initializable {

	ControladorEscenarios controlador;
	
    public ControladorEscenarios getControlador() {
		return controlador;
	}

	public void setControlador(ControladorEscenarios controlador) {
		this.controlador = controlador;
	}
	
    @FXML
    private VBox panelDeInicio;
    
    @FXML
    private Button botonIngreso;

    @FXML
    private Button botonRegistro;
    
	@FXML
    private CheckBox VerPass;

    @FXML
    private PasswordField txtPass;

    @FXML
    private TextField txtPassMask;

    @FXML
    private TextField txtUsuario;

    @FXML
    void btnIngresar(ActionEvent event) {
    	controlador.cargarMiMascota();
    }

    @FXML
    void btnRegistrar(ActionEvent event) {
    	controlador.cargarResgistro();
    }
    
    //Conectar en passwordField y TextField
    public void maskPassword(PasswordField pass, TextField text, CheckBox check) {
    	
    	text.setVisible(false);
    	text.setManaged(false); //Oculta la informacion y simplemente "borra" la posicion que utiliza el elemento
    	
    	text.managedProperty().bind(check.selectedProperty()); //cuando se seleccione el checkbox se va a ocultar o hacer visible el textField
    	text.visibleProperty().bind(check.selectedProperty());
    	
    	text.textProperty().bindBidirectional(pass.textProperty()); //Se comparten los textos
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		maskPassword(txtPass, txtPassMask, VerPass);
		
	}

}
