package Flyweight;

import Flyweight.Flyweight.*;


public class Main {
    public static void main(String[] args) {
        FileFactory fileCreator = new FileFactory();

        File file1 = new File("TestFile");
        file1.font = fileCreator.newFont("Aerial");
        file1.color = fileCreator.newColor("Red");
        file1.size = fileCreator.newSize(12);

        File file2 = new File("TestFile2");
        file2.font = fileCreator.newFont("Aerial");
        file2.color = fileCreator.newColor("Blue");
        file2.size = fileCreator.newSize(12);

        System.out.println(file1 + "\n");
        System.out.println(file2 + "\n");
        System.out.println(fileCreator + "\n");

        File file3 = new File("TestFile3");
        file3.font = fileCreator.newFont("Verdana");
        file3.color = fileCreator.newColor("Green");
        file3.size = fileCreator.newSize(16);

        System.out.println(file3 + "\n");
        System.out.println(fileCreator + "\n");


    }
}