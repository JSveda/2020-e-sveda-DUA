package com.main.tests;

import com.main.tools.FileClonner;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

public class Testers {
    private static File file;
    private static String defaultPath;
    private static String fileName;
    private static final String JAVA_EXTENSION = ".java";
    private static final String CLASS_EXTENSION = ".class";
    private static String methodName;

    public static int getMethodResult(int[] request) {
        setDefaultPath();
        int response = -1;
        String filePath = file.getPath();

        // TODO copy file to `/filesToTest` folder and than work with them
        fileName = filePath.substring((filePath.lastIndexOf("/") + 1), filePath.lastIndexOf("."));

        String newJavaFilePath = defaultPath + fileName + JAVA_EXTENSION;
        String newClassFilePath = defaultPath + fileName + CLASS_EXTENSION;
        String classFileRootDirPath = "src/main/java/";
        System.out.println("java: " + newJavaFilePath + "\nclass: " + newClassFilePath);

        // Clon file
        System.out.println((FileClonner.clonFileToTest(file, newJavaFilePath)) ? "Cloned successfully" : "Clon failed");

        File javaFile = new File(newJavaFilePath);
        File classFileRootDir = new File(classFileRootDirPath);

        // JavaCompiler, ToolProvider download - compilation
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int compilerResult = compiler.run(null, null, null, (newJavaFilePath));

        File classFile = new File(newClassFilePath);

        System.out.println((javaFile.delete()) ? (javaFile.getPath() + " deleted") : "Delete failed");

        if (compilerResult == 0)
            System.out.println("Compiled successfully");
        else {
            System.out.println("Compile failed");
            return -1;
        }

        try (URLClassLoader loader = new URLClassLoader(new URL[]{classFileRootDir.toURI().toURL()})) {
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

        reset();
        System.out.println();
        System.out.println("response: " + response);
        return response;
    }

    public static ArrayList<Integer> getMethodResult(int request) {
        setDefaultPath();
        ArrayList<Integer> response = new ArrayList<>();
        String filePath = file.getPath();

        // TODO copy file to `/filesToTest` folder and than work with them
        fileName = filePath.substring((filePath.lastIndexOf("/") + 1), filePath.lastIndexOf("."));

        String newJavaFilePath = defaultPath + fileName + JAVA_EXTENSION;
        String newClassFilePath = defaultPath + fileName + CLASS_EXTENSION;
        String classFileRootDirPath = "src/main/java/";
        System.out.println("java: " + newJavaFilePath + "\nclass: " + newClassFilePath);

        // Clon file
        System.out.println((FileClonner.clonFileToTest(file, newJavaFilePath)) ? "Cloned successfully" : "Clon failed");

        File javaFile = new File(newJavaFilePath);
        File classFileRootDir = new File(classFileRootDirPath);

        // JavaCompiler, ToolProvider download - compilation
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int compilerResult = compiler.run(null, null, null, (newJavaFilePath));

        File classFile = new File(newClassFilePath);

        System.out.println((javaFile.delete()) ? (javaFile.getPath() + " deleted") : "Delete failed");

        if (compilerResult == 0)
            System.out.println("Compiled successfully");
        else {
            System.out.println("Compile failed");
            return response;
        }

        try (URLClassLoader loader = new URLClassLoader(new URL[]{classFileRootDir.toURI().toURL()})) {
            // Load and run class method
            String packageName = "com.main.filesToTest." + fileName;
            Class<?> cls = loader.loadClass(packageName);
            Method method = cls.getMethod(methodName, int.class);
            // set response by invoking the extracted method
            response = (ArrayList<Integer>) method.invoke(null,  request);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // delete class file
        System.out.println((classFile.delete()) ? (classFile.getPath() + " deleted") : "Delete failed");

        reset();
        System.out.println();
        System.out.println("response: " + response);
        return response;
    }

    public static void setFile(File file) {
        Testers.file = file;
    }

    public static void setMethodName(String methodName) {
        Testers.methodName = methodName;
    }
    public static void setDefaultPath() {
        Testers.defaultPath = "src/main/java/com/main/filesToTest/";
        Testers.fileName = "";
    }

    public static void reset() {
        Testers.file = null;
        Testers.methodName = null;
        Testers.fileName = null;
    }
}
