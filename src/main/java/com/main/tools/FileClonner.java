package com.main.tools;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.lang3.ArrayUtils;

public class FileClonner {
    public static boolean clonFileToTest(File original, String newPath) {
        File copy = new File(newPath);
        try {
            System.out.println((copy.delete()) ? (copy.getPath() + " deleted") : "Nothing deleted");
            System.out.println((copy.createNewFile()) ? "File created" : "copy.createNewFile() failed");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream in = new BufferedInputStream(new FileInputStream(original));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(copy))) {

            String wantedPackage = "package com.main.filesToTest;\n\n";
            out.write(wantedPackage.getBytes(StandardCharsets.UTF_8), 0, wantedPackage.length());
            out.flush();
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                String potencialPackage = new String(buffer, StandardCharsets.UTF_8).split(" ")[0];
                if (potencialPackage.equals("package")) {
                    out.write(ArrayUtils.addAll("// ".getBytes(StandardCharsets.UTF_8), buffer));
                    continue;
                }
                System.out.println(new String(buffer, StandardCharsets.UTF_8));
                out.write(buffer, 0, lengthRead);
                out.flush();
            }

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}
