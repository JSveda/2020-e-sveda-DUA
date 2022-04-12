package com.main.tests;

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

    @Test
    public void isCorrect() {
        int[] request = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int correctResult = 9;
        int response = getMethodResult(request);
        assertEquals(correctResult, response);
    }

    private int getMethodResult(int[] request) {
        int response = -1;

        // JavaCompiler, ToolProvider download
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int compilerResult = compiler.run(null, null, null, file.getPath());
        System.out.println((compilerResult == 0) ? "Compiled successfully" : "Compile failed");

        // TODO copy file to `/filesToTest` folder and than work with them
        File copy = new File("/src/com/main/filesToTest/DruheNejvetsiCislo.java");
        try {
            if (copy.createNewFile())
                System.out.println("File created");
            else
                System.out.println("Creation failed");
        } catch (IOException e) {
            e.printStackTrace();
        }



        /*
        try {
            String classFilePath = file.getPath().substring(0, file.getPath().lastIndexOf("."));
            System.out.println(classFilePath);
            File classFile = new File(classFilePath + ".class");

            URL url = classFile.toURI().toURL();
            URLClassLoader loader = new URLClassLoader(new URL[] {url});

            Class<?> cls = loader.loadClass("DruheNejvetsiCislo");
            Method method = cls.getMethod("druheNejvetsiCislo", int[].class);

            loader.close();

            // set response
            response = (int) method.invoke(null, (Object) request);

            // delete class file
            if (classFile.delete())
                System.out.println("File deleted");
            else
                System.out.println("Delete failed");
        } catch (Exception e) {
            e.printStackTrace();
        }
         */

        return response;
    }

    public static void setFile(File file) {
        SecondBiggestNumberInArray.file = file;
    }
}
