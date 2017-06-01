/**
 * Created by cmc255700 on 5/31/2017.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.awt.*;
import javax.swing.*;
public class First extends Application {

    public void start(Stage primaryStage) throws Exception {
        Button b = new Button("click here");
            Scene scene = new Scene(b);
            primaryStage.setScene(scene);
            primaryStage.show();
    }

    }