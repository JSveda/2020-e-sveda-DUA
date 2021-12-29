package com.main;

import com.main.tools.ObjectReader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class mainMenuController implements Initializable {

    private final ObjectReader objectReader = new ObjectReader("src/main/java/com/main/files/listOfHrefs.dat");

    @FXML
    private Label arrayDataProcessing;
    private boolean arrayDataProcessingClicked = false;
    @FXML
    private Label eukleidAlgorithm;
    @FXML
    private Label binarySearchingTree;
    @FXML
    private Label arraySorting;
    @FXML
    private Label abstractDataType;
    @FXML
    private Label arraySearching;
    @FXML
    private Label inputDataProcessing;
    @FXML
    private Label algorithmBasics;
    private boolean algorithmBasicsClicked = false;
    @FXML
    private Label primeNumbers;
    @FXML
    private Label directKeyIndexing;
    @FXML
    private Label matrixAlgorithms;
    @FXML
    private Label polynomialAlgorithms;
    @FXML
    private Label simpleAlgorithms;
    @FXML
    private Label bigIntegers;
    @FXML
    private Label calendarAlgorithms;

    @FXML
    private ListView<String> pathList;
    private ObservableList<String> items = FXCollections.observableArrayList();
    @FXML
    private ImageView logoImg;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pathList.setItems(items);
        try {
            items.addAll(Objects.requireNonNull(objectReader.getArrayList()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
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
    public void goToPolynomialAlgorithms(Event event) {
        pathList.scrollTo("POLYNOMY");
    }

    @FXML
    public void goToBinarySearchingTree(Event event) {
        pathList.scrollTo("BINÁRNÍ VYHLEDÁVACÍ STROM");
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
    public void goToAbstractDataTypes(Event event) {
        pathList.scrollTo("ABSTRAKTNÍ DATOVÉ TYPY");
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
    public void goToDirectKeyIndexing(Event event) {
        pathList.scrollTo("PŘÍMÁ INDEXACE KLÍČE");
    }

    @FXML
    public void goToBigIntegers(Event event) {
        pathList.scrollTo("DLOUHÁ ČÍSLA");
    }

    @FXML
    public void goToCalendarAlgorithms(Event event) {
        pathList.scrollTo("KALENDÁŘ");
    }
}
