package com.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StageController {
    private Stage currentStage;
    private Scene currentScene;
    private Parent currentRoot;

    public void switchToMainMenu(ActionEvent e) {
        try {
            currentRoot = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("mainMenu.fxml")));
            currentStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            currentScene = new Scene(currentRoot);
            currentStage.setScene(currentScene);
            currentStage.show();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}