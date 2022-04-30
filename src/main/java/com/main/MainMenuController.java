package com.main;

import com.main.tools.ObjectReader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {

    // Object for reading list of elements of ListView in Java FXML
    private ObjectReader objectReader;
    private static String srollID;

    // Java FX --- changing Stage, Scene, Parent
    private Stage currentStage;
    private Scene currentScene;
    private Parent currentRoot;

    public static String getSrollID() {
        return srollID;
    }

    public static void setSrollID(String srollID) {
        MainMenuController.srollID = srollID;
    }

    @FXML
    private Label arrayDataProcessing;
    @FXML
    private Label eukleidAlgorithm;
    @FXML
    private Label arraySorting;
    @FXML
    private Label arraySearching;
    @FXML
    private Label inputDataProcessing;
    @FXML
    private Label algorithmBasics;
    @FXML
    private Label primeNumbers;
    @FXML
    private Label matrixAlgorithms;
    @FXML
    private Label simpleAlgorithms;
    @FXML
    private Label calendarAlgorithms;

    @FXML
    private ListView<String> pathList;
    private ObservableList<String> observableList = FXCollections.observableArrayList();
    @FXML
    private ImageView logoImg;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        objectReader = new ObjectReader("src/main/java/com/main/files/listOfHrefs.dat");
        observableList.addAll(objectReader.getLinkedHashMap().keySet());
        pathList.setItems(observableList);
    }


    @FXML
    public void goToAlgorithmBasics(Event event) {
        pathList.scrollTo("ZÁKLADY ALGORITMŮ");
    }

    @FXML
    public void gotToSimpleAlgorithms(Event event) {
        pathList.scrollTo("JEDNODUCHÉ ALGORITMY");
    }

    @FXML
    public void goToArrayDataProcessing(Event event) {
        pathList.scrollTo("ZPRACOVÁNÍ DAT V POLI");
    }

    @FXML
    public void goToMatrixAlgorithms(Event event) {
        pathList.scrollTo("MATICE");
    }

    @FXML
    public void goToEukleidAlgorithm(Event event) {
        pathList.scrollTo("EUKLEIDŮV ALGORITMUS");
    }

    @FXML
    public void goToArraySearching(Event event) {
        pathList.scrollTo("VYHLEDÁVÁNÍ V POLI");
    }

    @FXML
    public void goToInputDataProcessing(Event event) {
        pathList.scrollTo("ZPRACOVÁNÍ DAT ZE VSTUPU");
    }

    @FXML
    public void goToArraySorting(Event event) {
        pathList.scrollTo("ŘAZENÍ DAT V POLI");
    }

    @FXML
    public void goToPrimeNumbers(Event event) {
        pathList.scrollTo("PRVOČÍSELNOST");
    }

    @FXML
    public void goToCalendarAlgorithms(Event event) {
        pathList.scrollTo("KALENDÁŘ");
    }

    @FXML
    public void goToPage(Event event) {
        String selectedItem = pathList.getSelectionModel().getSelectedItem();
        MainMenuController.setSrollID(objectReader.getLinkedHashMap().get(selectedItem));
        System.out.println("-------------------------------------------------");
        System.out.println("clicked on: " + selectedItem );
        System.out.println("destination: " + getSrollID() );
        System.out.println("-------------------------------------------------");

        changeScene(event, selectedItem);
    }

    private void changeScene(Event event, String selectedItem) {
        try {
            currentRoot = FXMLLoader.load(Objects.requireNonNull(DUA.class.getResource(objectReader.getLinkedHashMap().get(selectedItem))));
            currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentScene = new Scene(currentRoot);
            currentStage.setScene(currentScene);
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
