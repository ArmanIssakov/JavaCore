package kz.arman.jcore.sample;

import kz.arman.jcore.regular.Copy;

import java.io.*;
import java.nio.file.*;

import static java.nio.file.LinkOption.NOFOLLOW_LINKS;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup*/

        Copy.copyAllFiles(".","./backup");





//    Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
//    и представляют собой, например, состояния ячеек поля для игры в крестики-нолики,
//    где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение.
//    Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
//    Записать в файл 9 значений так, чтобы они заняли три байта.

        byte[] bytesArray = new  byte[] {1, 2 , 3, 0, 1, 2, 3, 0, 1};
        String[] s = new String[9];
        for (int i = 0; i < bytesArray.length; i++) {
            switch (bytesArray[i]){
                case 0:
                   s[i] = "00";
                   break;
                case 1:
                    s[i] = "01";
                    break;
                case 2:
                    s[i] = "10";
                    break;
                case 3:
                    s[i] = "11";
                    break;
            }

        }
        byte[] encodArray = new byte[3];
        byte[] encodArray1 = new byte[3];
        encodArray[0] = (byte) Integer.parseInt((s[0]+s[1]+s[2]),2);
        encodArray[1] = (byte) Integer.parseInt((s[3]+s[4]+s[5]),2);
        encodArray[2] = (byte) Integer.parseInt((s[6]+s[7]+s[8]),2);

        File encodingFile = new File("encodingFile.txt");

        FileOutputStream outFile = new FileOutputStream(encodingFile);
        outFile.write(encodArray);
        outFile.close();
        FileInputStream inFile = new FileInputStream(encodingFile);
        byte count = (byte) inFile.read(encodArray1, 0 , 3);
        System.out.println("Массив из 9 элементов закодирован в 3 элемента типа byte:");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + encodArray1[i]);
        }
        System.out.println();
        String decode = "";
        for (int i = 0; i < encodArray1.length; i++) {
            String buff = Integer.toBinaryString(encodArray1[i]);
            while (buff.length() != 6){
                buff = "0" + buff;
            }
            decode = decode + buff;
        }
        String[] decodeArray = new String[9];
        decodeArray = decode.split("(?<=\\G.{2})");
        System.out.println("Распечатан изначальный разкодированный массив:");
        for (int i = 0; i < decodeArray.length; i++) {
            switch (decodeArray[i]){
                case "00":
                    System.out.print(" " + 0);
                    break;
                case "01":
                    System.out.print(" " + 1);
                    break;
                case "10":
                    System.out.print(" " + 2);
                    break;
                case "11":
                    System.out.print(" " + 3);
                    break;

            }
        }
        System.out.println();
        System.out.println("Размер закодированного файла в байтах равен: " + encodingFile.length());



    }



}
