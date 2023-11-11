/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package trabalho_pag_login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

public class CadastroUsuarioController implements Initializable {

    @FXML
    TextField txtNome;
    
    @FXML
    Button btnSalvar;
    
    @FXML
    SplitMenuButton splitEstadoCivil;
    
    @FXML
    CheckBox checkBrasileiro;
    
    @FXML
    DatePicker dateData;
    
    @FXML
    CheckBox checkSim;
    
    @FXML
    CheckBox checkNao;
    
    @FXML
    Slider sliderEscolaridade;
    
    @FXML
    Button btnNovo;
    
    @FXML
    Button btnSair;
    
    
    
    
    public void btnSalvar(ActionEvent event){
        String NomeDoUsuario = txtNome.getText();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
