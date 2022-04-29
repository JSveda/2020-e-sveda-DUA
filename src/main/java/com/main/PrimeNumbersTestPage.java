package com.main;

import com.main.tests.PrimeDecomposition;
import com.main.tests.TestRunner;
import com.main.tests.Testers;
import com.main.tools.Utils;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class PrimeNumbersTestPage implements Initializable {

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
        File htmlFile = new File("src/main/java/com/main/htmlFiles/primeNumbersTestPage.html");
        webView.getEngine().load(htmlFile.toURI().toString());
    }

    @javafx.fxml.FXML
    public void chooseFile() {
        var inputFile = Utils.chooseFile();
        fileNameLabel.setText(inputFile.getName());
        if (!inputFile.isFile() || !inputFile.exists()) {
            imageView.setImage(Utils.getCross());
        } else {
            Testers.setFile(inputFile);
            Testers.setMethodName("prvociselnyRozklad");
            if (TestRunner.test(PrimeDecomposition.class)) {
                imageView.setImage(Utils.getTik());
            } else {
                imageView.setImage(Utils.getCross());
            }
        }
    }

    @javafx.fxml.FXML
    public void goToMainMenu(Event event) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(DUA.class.getResource("mainMenu.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
