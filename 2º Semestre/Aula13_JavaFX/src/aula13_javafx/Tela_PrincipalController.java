
package aula13_javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Tela_PrincipalController implements Initializable {
    
    String valorAntigo = "";
    String operacaoAntiga = "";
        
    @FXML
    Button btn0;
    @FXML
    Button btn1;
    @FXML
    Button btn2;
    @FXML
    Button btn3;
    @FXML
    Button btn4;
    @FXML
    Button btn5;
    @FXML
    Button btn6;
    @FXML
    Button btn7;
    @FXML
    Button btn8;
    @FXML
    Button btn9;
    @FXML
    Button btn_igual;
    @FXML
    Button btn_soma;
    @FXML
    Button btn_divisao;
    @FXML
    Button btn_multiplicacao;
    @FXML
    Button btn_porcentagem;
    @FXML
    Button btn_del;
    @FXML
    Button btn_diminuir;
    @FXML
    Button btn_clear;
    @FXML
    Button btn_clear_new;
    @FXML
    Button btn_ponto;
    
    @FXML
    TextField display;
    
    @FXML
    private void btn0_action(ActionEvent event){
        display.setText(display.getText() + "0");
    }
    
    @FXML
    private void btn1_action(ActionEvent event){
        display.setText(display.getText() + "1");
    }
    
    @FXML
    private void btn2_action(ActionEvent event){
        display.setText(display.getText() + "2");
    }
    
    @FXML
    private void btn3_action(ActionEvent event){
        display.setText(display.getText() + "3");
    }
    
    @FXML
    private void btn4_action(ActionEvent event){
        display.setText(display.getText() + "4");
    }
    
    @FXML
    private void btn5_action(ActionEvent event){
        display.setText(display.getText() + "5");
    }
    
    @FXML
    private void btn6_action(ActionEvent event){
        display.setText(display.getText() + "6");
    }
    
    @FXML
    private void btn7_action(ActionEvent event){
        display.setText(display.getText() + "7");
    }
    
    @FXML
    private void btn8_action(ActionEvent event){
        display.setText(display.getText() + "8");
    }
    
    @FXML
    private void btn9_action(ActionEvent event){
        display.setText(display.getText() + "9");
    }
    
    @FXML
    
    private void btn_igual_action(ActionEvent event){
        if (operacaoAntiga.equals("+")){
            double resultado;
            resultado = Double.parseDouble(valorAntigo) + Double.parseDouble(display.getText());
            display.setText(String.valueOf(resultado));
        }
        else if(operacaoAntiga.equals("-")){
            double resultado;
            resultado = Double.parseDouble(valorAntigo) - Double.parseDouble(display.getText());
            display.setText(String.valueOf(resultado));
        }
        else if(operacaoAntiga.equals("*")){
            double resultado;
            resultado = Double.parseDouble(valorAntigo) * Double.parseDouble(display.getText());
            display.setText(String.valueOf(resultado));
        }
        else if(operacaoAntiga.equals("/")){
            double resultado;
            resultado = Double.parseDouble(valorAntigo) / Double.parseDouble(display.getText());
            display.setText(String.valueOf(resultado));
        }
        else if(operacaoAntiga.equals("%")){
            double resultado;
            resultado = Double.parseDouble(valorAntigo) % Double.parseDouble(display.getText());
            display.setText(String.valueOf(resultado));
        }
    }
    
    @FXML
    private void btn_soma_action(ActionEvent event){
        valorAntigo = display.getText();
        operacaoAntiga = "+";
        display.setText("");
    }
    
    @FXML
    private void btn_diminuir_action(ActionEvent event){
        valorAntigo = display.getText();
        operacaoAntiga = "-";
        display.setText("");
    }
    
    @FXML
    private void btn_divisao_action(ActionEvent event){
        valorAntigo = display.getText();
        operacaoAntiga = "/";
        display.setText("");
    }
    
    @FXML
    private void btn_multiplicacao_action(ActionEvent event){
        valorAntigo = display.getText();
        operacaoAntiga = "*";
        display.setText("");
    }
    
    @FXML
    private void btn_porcentagem_action(ActionEvent event){
        valorAntigo = display.getText();
        operacaoAntiga = "%";
        display.setText("");
    }
    
    @FXML
    private void btn_clear_action(ActionEvent event){
        valorAntigo = display.getText();
        display.setText("");
    }
    
    @FXML
    private void btn_clear_new_action(ActionEvent event){
        valorAntigo = display.getText();
        display.setText("");
    }
    
    @FXML
    private void btn_del_action(ActionEvent event){
        valorAntigo = display.getText();
        display.setText("");
    }
    
    @FXML
    private void btn_ponto_action(ActionEvent event){
        valorAntigo = display.getText();
        display.setText(valorAntigo + ".");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
}
