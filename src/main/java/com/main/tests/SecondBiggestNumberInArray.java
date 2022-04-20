package com.main.tests;

import com.main.tools.FileClonner;
import org.junit.Test;

import javax.tools.ToolProvider;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import javax.tools.JavaCompiler;

import static org.junit.Assert.assertEquals;

public class SecondBiggestNumberInArray {
    private static File file;
    private static String defaultPath;
    private static String fileName;
    private static final String JAVA_EXTENSION = ".java";
    private static final String CLASS_EXTENSION = ".class";
    private static final String methodName = "druheNejvetsiCislo";

    @Test
    public void isCorrect() {
        int[] request = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int correctResult = 9;
        int response = getMethodResult(request);
        assertEquals(correctResult, response);
    }

    private int getMethodResult(int[] request) {
        setDefaultPath();
        int response = -1;
        String filePath = file.getPath();

        // TODO copy file to `/filesToTest` folder and than work with them
        fileName = filePath.substring((filePath.lastIndexOf("/") + 1), filePath.lastIndexOf("."));

        String newJavaFilePath = defaultPath + fileName + JAVA_EXTENSION;
        String newClassFilePath = defaultPath + fileName + CLASS_EXTENSION;
        System.out.println("java: " + newJavaFilePath + "\nclass: " + newClassFilePath);

        // Clon file
        System.out.println((FileClonner.clonFileToTest(file, newJavaFilePath)) ? "Cloned successfully" : "Clon failed");

        File javaFile = new File(newJavaFilePath);
        File classFile;
        // JavaCompiler, ToolProvider download - compilation
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int compilerResult = compiler.run(null, null, null, (newJavaFilePath));

        System.out.println((javaFile.delete()) ? (javaFile.getPath() + " deleted") : "Delete failed");

        if (compilerResult == 0)
            System.out.println("Compiled successfully");
        else {
            System.out.println("Compile failed");
            return -1;
        }
        classFile = new File(newClassFilePath);

        try (URLClassLoader loader = new URLClassLoader(new URL[]{classFile.toURI().toURL()})) {
            // Load and run class method
            String packageName = "com.main.filesToTest." + fileName;
            Class<?> cls = loader.loadClass(packageName);
            Method method = cls.getMethod(methodName, int[].class);
            // set response by invoking the extracted method
            response = (int) method.invoke(null, (Object) request);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // delete class file
        System.out.println((classFile.delete()) ? (classFile.getPath() + " deleted") : "Delete failed");

        System.out.println();
        file = null;
        System.out.println("response: " + response);
        return response;
    }

    public static void setFile(File file) {
        SecondBiggestNumberInArray.file = file;
    }

    public static void setDefaultPath() {
        SecondBiggestNumberInArray.defaultPath = "src/main/java/com/main/filesToTest/";
    }
}
