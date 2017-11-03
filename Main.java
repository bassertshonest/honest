package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    String zoinks = CommandLineHandler.getRouterIP();
}

/**
 * Overview of program:
 * The whole intention with Honest. is creating a simple log program which will save pings to a text file for tech support purposes
 * The name of the project is a play on the Australian Democrats slogan
 */