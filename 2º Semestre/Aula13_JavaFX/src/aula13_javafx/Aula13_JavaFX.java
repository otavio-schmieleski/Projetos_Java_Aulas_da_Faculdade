
package aula13_javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import java.io.IOException;
import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Aula13_JavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        String file = "Tela_Principal.fxml";
        URL url = getClass().getResource(file);
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }  
    
}
