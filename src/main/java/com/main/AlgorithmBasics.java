package com.main;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AlgorithmBasics implements Initializable {
    @FXML
    private WebView webView;
    @FXML
    private Button mainMenuButton;
    @FXML
    private Button previousPageButton;
    @FXML
    private Button nextPageButton;

    private Parent root;
    private Stage stage;
    private Scene scene;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File htmlFile = new File("src/main/java/com/main/htmlFiles/algorithmBasics.html");
        webView.getEngine().load(htmlFile.toURI().toString());
    }

    @FXML
    public void goToNextPage(Event event) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("simpleAlgorithms.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
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
