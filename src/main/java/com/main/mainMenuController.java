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

public class mainMenuController implements Initializable {

    // Object for reading list of elements of ListView in Java FXML
    private ObjectReader objectReader;

    // Java FX --- changing Stage, Scene, Parent
    private Stage currentStage;
    private Scene currentScene;
    private Parent currentRoot;

    @FXML
    private Label arrayDataProcessing;
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
    private ObservableList<String> observableList = FXCollections.observableArrayList();
    @FXML
    private ImageView logoImg;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LinkedHashMap<String, String> items = new LinkedHashMap<>();
        items.put("ZÁKLADY ALGORITMŮ", "algorithmBasics.fxml");
        items.put("Efektivita a složitost", "");
        items.put("Asymptotická časová složitost", "");
        items.put("JEDNODUCHÉ ALGORITMY", "simpleAlgorithms.fxml");
        items.put("Dělitelnost", "");
        items.put("Práce s polem", "");
        items.put("Intervaly a velikosti proměnných", "");
        items.put("Modulo operace", "");
        items.put("EUKLEIDŮV ALGORITMUS", "eukleidAlgorithm.fxml");
        items.put("Největší společný dělitel", "");
        items.put("Nejmenší společný násobek", "");
        items.put("PRVOČÍSELNOST", "primeNumbers.fxml");
        items.put("Test prvočíselnosti", "");
        items.put("Eratostedovo síto", "");
        items.put("Prvočíselný rozklad", "");
        items.put("VYHLEDÁVÁNÍ V POLI", "arraySearching.fxml");
        items.put("Sekvenční vyhledávání", "");
        items.put("Sekvenční vyhledávání se zarážkou", "");
        items.put("Binární vyhledávání", "");
        items.put("ZPRACOVÁNÍ DAT ZE VSTUPU", "inputDataProcessing.fxml");
        items.put("Příklady algoritmů data ze vstupu", "");
        items.put("ZPRACOVÁNÍ DAT V POLI", "arrayDataProcessing.fxml");
        items.put("Cyklický posun prvků v poli", "");
        items.put("Srovnání čísel do kategorií", "");
        items.put("Počet různých hodnot v poli", "");
        items.put("ŘAZENÍ DAT V POLI", "arraySorting.fxml");
        items.put("Select sort", "");
        items.put("Insert sort", "");
        items.put("Bubble sort", "");
        items.put("Merge sort", "");
        items.put("Vnější třídění", "");
        items.put("MATICE", "matrixAlgorithms.fxml");
        items.put("Příklady algoritmů matic", "");
        items.put("Pojmy", "");
        items.put("KALENDÁŘ", "calendarAlgorithms.fxml");
        items.put("Přestupnost roku", "");
        items.put("Příklady algoritmů kaledáře", "");
        items.put("DLOUHÁ ČÍSLA", "bigIntegers.fxml");
        items.put("Příklady algoritmů dlouhých čísel", "");
        items.put("POLYNOMY", "polynomialAlgorithms.fxml");
        items.put("Hornerovo schéma", "");
        items.put("Převody číselných soustav", "");
        items.put("ABSTRAKTNÍ DATOVÉ TYPY", "abstractDataTypes.fxml");
        items.put("Zásobník", "");
        items.put("Fronta", "");
        items.put("Halda", "");
        items.put("BINÁRNÍ VYHLEDÁVACÍ STROM", "binarySearchingTree.fxml");
        items.put("Vyvažování BVS", "");
        items.put("PŘÍMÁ INDEXACE KLÍČE", "directKeyIndexing.fxml");
        items.put("Hešování", "");


        FileOutputStream f = null;
        ObjectOutputStream o = null;
        try {
            f = new FileOutputStream("/Users/jakub.sveda/Documents/IdeaProjects/DUAlgorithms/src/main/java/com/main/files/listOfHrefs.dat");
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

        objectReader = new ObjectReader("/Users/jakub.sveda/Documents/IdeaProjects/DUAlgorithms/src/main/java/com/main/files/listOfHrefs.dat");

        observableList.addAll(items.keySet());
        pathList.setItems(observableList);
        try {
            //items.addAll(Objects.requireNonNull(objectReader.getArrayList()));
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

    @FXML
    public void goToPage(Event event) {
        String selectedItem = pathList.getSelectionModel().getSelectedItem();
        System.out.println("-------------------------------------------------");
        System.out.println("clicked on: " + selectedItem);
        System.out.println("destination: " + objectReader.getLinkedHashMap().get(selectedItem));
        System.out.println("-------------------------------------------------");

        changeScene(event, selectedItem);
    }

    private void changeScene(Event event, String selectedItem) {
        try {
            currentRoot = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(objectReader.getLinkedHashMap().get(selectedItem))));
            currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentScene = new Scene(currentRoot);
            currentStage.setScene(currentScene);
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
