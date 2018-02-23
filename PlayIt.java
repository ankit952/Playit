/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* References:
                https://www.youtube.com/watch?v=7Gdxl2045l8&t=1863s
                www.stackoverflow.com  For refering use of Time Seek Sider 
*/
package playit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ankit
 * @author Gaurav
 * @author Subham
 * @author Vikash
 * @author Shivansh
 * 
 */
public class PlayIt extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        stage.setTitle("PlayIt");
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
