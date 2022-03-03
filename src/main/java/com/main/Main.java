package com.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static boolean isFullscreen = false;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("mainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 500);
        stage.setTitle("Digitální učebnice algoritmů");
        stage.setMinWidth(800);
        stage.setMinHeight(620);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static boolean isFullscreen() {
        return isFullscreen;
    }

    public static void setFullscreen(boolean isFullscreen) {
        Main.isFullscreen = isFullscreen;
    }
}