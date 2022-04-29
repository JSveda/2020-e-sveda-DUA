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
    private static final File classFileRootDir = new File("src/main/java/");

    static File javaFile;
    static File classFile;
    private static String methodName;

    private static int counter = 0;

    public static int getMethodResult(int[] request) {
        int response = -1;
        setDefaultPath();
        if (!clonAndCompileFile())
            return -1;

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


        reset();
        return response;
    }

    public static int[] getMethodResult(int request1, int request2, int request3) {
        counter++;
        int[] response = null;
        setDefaultPath();
        if (!clonAndCompileFile())
            return null;

        try (URLClassLoader loader = new URLClassLoader(new URL[]{classFileRootDir.toURI().toURL()})) {
            // Load and run class method
            String packageName = "com.main.filesToTest." + fileName;
            Class<?> cls = loader.loadClass(packageName);
            Method method = cls.getMethod(methodName, int.class, int.class, int.class);
            // set response by invoking the extracted method
            response = (int[]) method.invoke(null, request1, request2, request3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (counter == 3) {
            counter = 0;
            reset();
        }

        return response;
    }

    public static int getMethodResult(int[][] request) {
        int response = -1;
        setDefaultPath();
        if (!clonAndCompileFile())
            return -1;

        try (URLClassLoader loader = new URLClassLoader(new URL[]{classFileRootDir.toURI().toURL()})) {
            // Load and run class method
            String packageName = "com.main.filesToTest." + fileName;
            Class<?> cls = loader.loadClass(packageName);
            Method method = cls.getMethod(methodName, int[][].class);
            // set response by invoking the extracted method
            response = (int) method.invoke(null, (Object) request);
        } catch (Exception e) {
            e.printStackTrace();
        }


        reset();
        return response;
    }

    public static ArrayList<Integer> getMethodResult(int request) {
        ArrayList<Integer> response = new ArrayList<>();
        setDefaultPath();
        if (!clonAndCompileFile())
            return response;

        try (URLClassLoader loader = new URLClassLoader(new URL[]{classFileRootDir.toURI().toURL()})) {
            // Load and run class method
            String packageName = "com.main.filesToTest." + fileName;
            Class<?> cls = loader.loadClass(packageName);
            Method method = cls.getMethod(methodName, int.class);
            // set response by invoking the extracted method
            response = (ArrayList<Integer>) method.invoke(null, request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        reset();
        return response;
    }

    public static <T> T getMethodResult(int[] request1, int request2) {
        T response = null;
        setDefaultPath();
        if (!clonAndCompileFile())
            return null;

        try (URLClassLoader loader = new URLClassLoader(new URL[]{classFileRootDir.toURI().toURL()})) {
            // Load and run class method
            String packageName = "com.main.filesToTest." + fileName;
            Class<?> cls = loader.loadClass(packageName);
            Method method = cls.getMethod(methodName, int[].class, int.class);
            // set response by invoking the extracted method
            response = (T) method.invoke(null, request1, request2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        reset();
        return response;
    }

    public static int[] getMethodResult(File file) {
        int[] response = new int[2];
        setDefaultPath();
        if (!clonAndCompileFile())
            return response;

        try (URLClassLoader loader = new URLClassLoader(new URL[]{classFileRootDir.toURI().toURL()})) {
            // Load and run class method
            String packageName = "com.main.filesToTest." + fileName;
            Class<?> cls = loader.loadClass(packageName);
            Method method = cls.getMethod(methodName, File.class);
            // set response by invoking the extracted method
            response = (int[]) method.invoke(null, file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        reset();
        return response;
    }

    public static void setFile(File file) {
        Testers.file = file;
    }

    public static void setMethodName(String methodName) {
        Testers.methodName = methodName;
    }

    private static void setDefaultPath() {
        Testers.defaultPath = "src/main/java/com/main/filesToTest/";
        Testers.fileName = "";
    }

    private static void reset() {
        // delete class file
        System.out.println((classFile.delete()) ? (classFile.getPath() + " deleted") : "Delete failed");
        Testers.file = null;
        Testers.methodName = null;


        Testers.fileName = null;
    }

    private static boolean clonAndCompileFile() {
        String filePath = file.getPath();

        // extract fileName
        fileName = filePath.substring((filePath.lastIndexOf("/") + 1), filePath.lastIndexOf("."));

        String newJavaFilePath = defaultPath + fileName + JAVA_EXTENSION;
        String newClassFilePath = defaultPath + fileName + CLASS_EXTENSION;
        String classFileRootDirPath = "src/main/java/";
        System.out.println("java: " + newJavaFilePath + "\nclass: " + newClassFilePath);

        // Clon file
        System.out.println((FileClonner.clonFileToTest(file, newJavaFilePath)) ? "Cloned successfully" : "Clon failed");

        javaFile = new File(newJavaFilePath);

        // JavaCompiler, ToolProvider download - compilation
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int compilerResult = compiler.run(null, null, null, (newJavaFilePath));

        classFile = new File(newClassFilePath);

        System.out.println((javaFile.delete()) ? (javaFile.getPath() + " deleted") : "Delete failed");

        if (compilerResult == 0)
            System.out.println("Compiled successfully");
        else {
            System.out.println("Compile failed");
            return false;
        }

        return true;
    }
}
