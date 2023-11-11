
package trabalho_pag_login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class View_LoginController implements Initializable {

    @FXML
    Button btnSair;
    
    @FXML
    Button btnLogin;
    
    @FXML
    Button btn_home;
    
    @FXML
    TextField text_user;
    
    @FXML
    TextField text_password;
    
    @FXML
    private void btnSair(ActionEvent event){
        System.exit(0);
    }
    
    @FXML
    private void btnLoginClick(ActionEvent event) throws IOException{
        String file = "CadastroUsuario.fxml";
        URL url = getClass().getResource(file);
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        Stage stage = (Stage) btnLogin.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Unimater");
        stage.show();
        
    }
    
    @FXML
    private void btnSairClick(ActionEvent event) throws IOException{
    
    }
    
    @FXML
    private void btnHomeClick(ActionEvent event) throws IOException{
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
