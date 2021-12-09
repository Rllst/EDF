package com.example.edf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        URL xmlUrl = getClass().getResource("/window.fxml");
        System.out.println(Boolean.toString(xmlUrl==null));
        Parent root = FXMLLoader.load(xmlUrl);
        primaryStage.setTitle("EDF Scheduler");
        primaryStage.setScene(new Scene(root, 800, 640));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}