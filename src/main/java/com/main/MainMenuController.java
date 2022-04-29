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
        LinkedHashMap<String, String> items = new LinkedHashMap<>();
        items.put("ZÁKLADY ALGORITMŮ", "algorithmBasics.fxml");
        items.put("Efektivita a složitost", "algorithmBasics.fxml");
        items.put("Asymptotická časová složitost", "algorithmBasics.fxml");
        items.put("JEDNODUCHÉ ALGORITMY", "simpleAlgorithms.fxml");
        items.put("Dělitelnost", "simpleAlgorithms.fxml");
        items.put("Práce s polem", "simpleAlgorithms.fxml");
        items.put("Intervaly a velikosti proměnných", "simpleAlgorithms.fxml");
        items.put("Modulo operace", "simpleAlgorithms.fxml");
        items.put("EUKLEIDŮV ALGORITMUS", "eukleidAlgorithm.fxml");
        items.put("Největší společný dělitel", "eukleidAlgorithm.fxml");
        items.put("Nejmenší společný násobek", "eukleidAlgorithm.fxml");
        items.put("PRVOČÍSELNOST", "primeNumbers.fxml");
        items.put("Test prvočíselnosti", "primeNumbers.fxml");
        items.put("Eratosthenovo síto", "primeNumbers.fxml");
        items.put("Prvočíselný rozklad", "primeNumbers.fxml");
        items.put("VYHLEDÁVÁNÍ V POLI", "arraySearching.fxml");
        items.put("Sekvenční vyhledávání", "arraySearching.fxml");
        items.put("Sekvenční vyhledávání se zarážkou", "arraySearching.fxml");
        items.put("Binární vyhledávání", "arraySearching.fxml");
        items.put("ZPRACOVÁNÍ DAT ZE VSTUPU", "inputDataProcessing.fxml");
        items.put("Příklady algoritmů data ze vstupu", "inputDataProcessing.fxml");
        items.put("ZPRACOVÁNÍ DAT V POLI", "arrayDataProcessing.fxml");
        items.put("Cyklický posun prvků v poli", "arrayDataProcessing.fxml");
        items.put("Srovnání čísel do kategorií", "arrayDataProcessing.fxml");
        items.put("Počet různých hodnot v poli", "arrayDataProcessing.fxml");
        items.put("ŘAZENÍ DAT V POLI", "arraySorting.fxml");
        items.put("Select sort", "arraySorting.fxml");
        items.put("Insert sort", "arraySorting.fxml");
        items.put("Bubble sort", "arraySorting.fxml");
        items.put("Merge sort", "arraySorting.fxml");
        items.put("Vnější třídění", "");
        items.put("MATICE", "matrixAlgorithms.fxml");
        items.put("Pojmy", "matrixAlgorithms.fxml");
        items.put("Příklady algoritmů matic", "matrixAlgorithms.fxml");
        items.put("KALENDÁŘ", "calendarAlgorithms.fxml");
        items.put("Přestupnost roku", "calendarAlgorithms.fxml");
        items.put("Kalendářové algoritmy", "calendarAlgorithms.fxml");


        FileOutputStream f = null;
        ObjectOutputStream o = null;
        try {
            f = new FileOutputStream("src/main/java/com/main/files/listOfHrefs.dat");
            o = new ObjectOutputStream(f);
            o.writeObject(items);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (o != null) {
                try {
                    o.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        objectReader = new ObjectReader("src/main/java/com/main/files/listOfHrefs.dat");

        observableList.addAll(items.keySet());
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
