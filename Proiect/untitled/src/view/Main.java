package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.AppManager;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setScene(new Scene(root, 600, 400));
        AppManager app = new AppManager();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
