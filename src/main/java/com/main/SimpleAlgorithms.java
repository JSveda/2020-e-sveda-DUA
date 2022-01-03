package com.main;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SimpleAlgorithms {
    @javafx.fxml.FXML
    private Button mainMenuButton;
    @javafx.fxml.FXML
    private WebView webView;
    @javafx.fxml.FXML
    private Button previousPageButton;
    @javafx.fxml.FXML
    private Button nextPageButton;

    private Parent root;
    private Stage stage;
    private Scene scene;

    @javafx.fxml.FXML
    public void goToPreviousPage(Event event) {
    }

    @javafx.fxml.FXML
    public void goToNextPage(Event event) {
    }

    @javafx.fxml.FXML
    public void goToMainMenu(Event event) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("mainMenu.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
