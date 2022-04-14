package com.main.tests;

import com.main.tools.FileClonner;
import org.junit.Test;

import javax.tools.ToolProvider;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import javax.tools.JavaCompiler;

import static org.junit.Assert.assertEquals;

public class SecondBiggestNumberInArray {
    private static File file;
    private static String workPath = "src/main/java/com/main/filesToTest/";

    @Test
    public void isCorrect() {
        int[] request = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int correctResult = 9;
        int response = getMethodResult(request);
        assertEquals(correctResult, response);
    }

    private int getMethodResult(int[] request) {
        int response = -1;
        String filePath = file.getPath();

        // TODO copy file to `/filesToTest` folder and than work with them
        workPath += filePath.substring((filePath.lastIndexOf("/") + 1), filePath.lastIndexOf("."));
        System.out.println(workPath + ".java");
        System.out.println((FileClonner.clonFileToTest(getFile(), (workPath + ".java"))) ? "Cloned successfully" : "Clon failed");

        File workFile = new File(workPath + ".java");
        System.out.println(workFile.getPath());
        File classFile;

        try {
            // JavaCompiler, ToolProvider download - compilation
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            int compilerResult = compiler.run(null, null, null, (workPath + ".java"));
            System.out.println((compilerResult == 0) ? "Compiled successfully" : "Compile failed");

            classFile = new File(workPath + ".class");

            URL url = classFile.toURI().toURL();
            // Load and run class method
            URLClassLoader loader = new URLClassLoader(new URL[] {url});
            Class<?> cls = loader.loadClass("com.main.filesToTest.DruheNejvetsiCislo");
            Method method = cls.getMethod("druheNejvetsiCislo", int[].class);
            // set response
            response = (int) method.invoke(null, (Object) request);

            loader.close();

            // delete class file
            System.out.println((classFile.delete()) ? (classFile.getPath() + " deleted") : "Delete failed");
            System.out.println((workFile.delete()) ? (workFile.getPath() + " deleted") : "Delete failed");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    public static void setFile(File file) {
        SecondBiggestNumberInArray.file = file;
    }

    public static File getFile() {
        return file;
    }

}
