package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            File myObj = new File(  "test1.txt");
            Scanner myReader = new Scanner(myObj);
            myReader
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("an error occurred.");
            e.printStackTrace();
        }

    }
}
