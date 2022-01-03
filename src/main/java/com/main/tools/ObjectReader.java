package com.main.tools;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashMap;

public class ObjectReader {
    private final LinkedHashMap<String, String> linkedHashMap;

    public ObjectReader(String path) {
        this.linkedHashMap = readLinkedHashMap(path);
    }

    public LinkedHashMap<String, String> getLinkedHashMap() {
        return linkedHashMap;
    }

    private LinkedHashMap<String, String> readLinkedHashMap(String path) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            return ((LinkedHashMap<String, String>) ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
}
