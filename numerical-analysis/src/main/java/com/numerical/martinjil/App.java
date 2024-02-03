package com.numerical.martinjil;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX Application for Numerical Analysis.
 * The application provides various numerical analysis functionalities
 * 
 * @author Njoroge Maina
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Numerical ANalysis");

        Scene scene = new Scene(null, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}