

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by sgfromrus on 11.2017
 */
public class MainFrame extends Application {
    public void start(Stage primaryStage) {
        primaryStage.setTitle("PasswordGenerator");
        primaryStage.setResizable(false);
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainFrame.class.getResource("MainFrame.fxml"));
            Pane pane = (Pane) loader.load();

            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
