package test;

import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        sample s= new sample();
        s.CreateDog();

    }
 private void CreateDog() {
            Scanner myscanner = new Scanner(System.in);
            System.out.println("What is the name of your Dog");
    String name = myscanner.nextLine();

    System.out.println("Hello Humman my name is " +name);
        }





}