package com.main;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class TestPage implements Initializable {

    @javafx.fxml.FXML
    private Label fileNameLabel;
    @javafx.fxml.FXML
    private Button mainMenuButton;
    @javafx.fxml.FXML
    private ImageView imageView;
    @javafx.fxml.FXML
    private Button chooseFileButton;
    @javafx.fxml.FXML
    private WebView webView;

    private Parent root;
    private Stage stage;
    private Scene scene;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File htmlFile = new File("src/main/java/com/main/htmlFiles/simpleAlgorithmsTestPage.html");
        webView.getEngine().load(htmlFile.toURI().toString());
    }

    @javafx.fxml.FXML
    public void chooseFile(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        File inputFile = fileChooser.showOpenDialog(null);
        fileNameLabel.setText(inputFile.getName());
        Image cross = new Image("src/img/redCross.png", true);
        Image tik = new Image("src/img/greenTik.png", true);
        if (!inputFile.isFile() || !inputFile.exists()) {
            imageView.setImage(cross);
        } else {
            if (true) {
                imageView.setImage(tik);
            } else {
                imageView.setImage(cross);
            }
        }
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
