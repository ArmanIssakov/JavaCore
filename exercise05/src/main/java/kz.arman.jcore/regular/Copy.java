package kz.arman.jcore.regular;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/*Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup*/
public class Copy {
    public static void copyAllFiles(String sourceDirectory, String targetDirectory) throws IOException {
        File source = new File(sourceDirectory);
        File dist = new File(targetDirectory);
        if (!dist.exists()){
            dist.mkdir();
        }
        if (source.listFiles() != null){
            for (File file : source.listFiles()) {
                if (file.isFile()){
                    File backupFile = new File(dist, file.getName());
                    Files.copy(file.toPath(), backupFile.toPath(), REPLACE_EXISTING);
                }
            }
        }


    }
}
