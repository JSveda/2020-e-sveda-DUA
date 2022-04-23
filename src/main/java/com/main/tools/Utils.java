package com.main.tools;

import javafx.scene.image.Image;
import javafx.stage.FileChooser;

import java.io.File;

public class Utils {
    private static final Image cross = new Image(new File("src/img/redCross.png").toURI().toString());
    private static final Image tik = new Image(new File("src/img/greenTik.png").toURI().toString());

    public static File chooseFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        return fileChooser.showOpenDialog(null);
    }



    public static Image getCross() {
        return cross;
    }

    public static Image getTik() {
        return tik;
    }
}
