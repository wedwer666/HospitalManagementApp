package sample.Pacients;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage myStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        myStage.setTitle("Lucrare de curs ");
        myStage.setScene(new Scene(root, 800, 600));
        myStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}