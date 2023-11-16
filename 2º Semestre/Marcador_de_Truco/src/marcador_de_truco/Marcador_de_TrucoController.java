package marcador_de_truco;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Marcador_de_TrucoController implements Initializable {

    @FXML
    Button btn_soma_J1;
    
    @FXML
    Button btn_soma_J2;
    
    @FXML
    Button btn_diminuir_J2;
    
    @FXML
    Button btn_diminuir_J1;
    
    @FXML
    Button btn_truco;
    
    @FXML
    Label pontos_J1;
    
    @FXML
    Label pontos_J2;
    
    @FXML
    Label vitorias_J1;
    
    @FXML
    Label vitorias_J2;
    
    int pontuacao_J1 = 0;
    int pontuacao_J2 = 0;
    
    int pontos_vitorias_J1 = 0;
    int pontos_vitorias_J2 = 0;
    
    int cont_truco = 0;
    int truco = 0;
    boolean truco_ativado = false;
    
    @FXML
    public void btn_soma_J1_action(ActionEvent event){
        if((pontuacao_J1 < 12) && (pontuacao_J1 >=0)){
            
            if( truco_ativado == true){
                
                pontuacao_J1 += truco;
                if ((pontuacao_J1 == 12) || (pontuacao_J1 > 12)){
                
                    pontuacao_J1 = 0;
                    pontos_J1.setText(Integer.toString(pontuacao_J1));

                    pontuacao_J2 = 0;
                    pontos_J2.setText(Integer.toString(pontuacao_J2));

                    pontos_vitorias_J1 += 1;
                    vitorias_J1.setText(Integer.toString(pontos_vitorias_J1));
                }else{
                    pontos_J1.setText(Integer.toString(pontuacao_J1));
                }
                              
                cont_truco = 0;
                truco = 0;
                truco_ativado = false;
                
                btn_truco.setText("TRUCO ("+truco+")");
                
            }else{
                pontuacao_J1 += 1;
                pontos_J1.setText(Integer.toString(pontuacao_J1));
            }
        }
    }
    
    @FXML
    public void btn_soma_J2_action(ActionEvent event){
        if((pontuacao_J2 < 12) && (pontuacao_J2 >=0)){
            if( truco_ativado == true){
                
                pontuacao_J2 += truco;
                if ((pontuacao_J2 == 12) || (pontuacao_J2 > 12)){
                
                    pontuacao_J2 = 0;
                    pontos_J2.setText(Integer.toString(pontuacao_J2));

                    pontuacao_J1 = 0;
                    pontos_J1.setText(Integer.toString(pontuacao_J1));

                    pontos_vitorias_J2 += 1;
                    vitorias_J2.setText(Integer.toString(pontos_vitorias_J2));
                }else{
                    pontos_J2.setText(Integer.toString(pontuacao_J2));
                }
                
                cont_truco = 0;
                truco = 0;
                truco_ativado = false;
                
                btn_truco.setText("TRUCO ("+truco+")");
                
            }else{
                pontuacao_J2 += 1;
                pontos_J2.setText(Integer.toString(pontuacao_J2));
            }
        }
    }
    
    @FXML
    public void btn_diminuir_J1_action(ActionEvent event){
        if((pontuacao_J1 <= 12) && (pontuacao_J1 >0)){
            pontuacao_J1 -= 1;
            pontos_J1.setText(Integer.toString(pontuacao_J1));
            
            if (pontuacao_J1 == 12){
                
                pontuacao_J1 = 0;
                pontos_J1.setText(Integer.toString(pontuacao_J1));
                
                pontuacao_J2 = 0;
                pontos_J2.setText(Integer.toString(pontuacao_J2));
                
                pontos_vitorias_J1 += 1;
                vitorias_J1.setText(Integer.toString(pontos_vitorias_J1));
            }
        }
    }
    
     @FXML
    public void btn_diminuir_J2_action(ActionEvent event){
        if((pontuacao_J2 <= 12) && (pontuacao_J2 >0)){
            pontuacao_J2 -= 1;
            pontos_J2.setText(Integer.toString(pontuacao_J2));
            
            if (pontuacao_J2 == 12){
                
                pontuacao_J2 = 0;
                pontos_J2.setText(Integer.toString(pontuacao_J2));
                
                pontuacao_J1 = 0;
                pontos_J1.setText(Integer.toString(pontuacao_J1));
                
                pontos_vitorias_J2 += 1;
                vitorias_J2.setText(Integer.toString(pontos_vitorias_J2));
            }
        }
    }
    
    @FXML
    public void btn_truco_action(ActionEvent event){
        
        if(cont_truco == 0){
            truco = 3;
            btn_truco.setText("TRUCO ("+truco+")");
            cont_truco += 1;
            truco_ativado = true;
            
        }else if(cont_truco == 1){
            truco = 6;
            btn_truco.setText("TRUCO ("+truco+")");
            cont_truco += 1; 
            truco_ativado = true;
            
        }else if(cont_truco == 2){
            truco = 9;
            btn_truco.setText("TRUCO ("+truco+")");
            cont_truco += 1;
             truco_ativado = true;
            
        }else if(cont_truco == 3){
            truco = 12;
            btn_truco.setText("TRUCO ("+truco+")");
            cont_truco += 1;
            truco_ativado = true;
            
        }else{
            cont_truco = 0;
            truco = 0;
            btn_truco.setText("TRUCO ("+truco+")");
        }
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
