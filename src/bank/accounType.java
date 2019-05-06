package bank;

import java.util.Scanner;

public class accounType {

    {

        private String name;
        private short pin;
        Scanner myScanner = new Scanner(System.in);

    public accounType()
        {
            pin = 1234;
            name = "John";
        }

        public boolean login() {
        System.out.println("Please enter your name");
        String username = myScanner.nextLine();
        System.out.println("Please enter your 4-digit pin");
        int userpin = Integer.parseInt(myScanner.nextLine());
        if (userpin == pin && username.equalsIgnoreCase(name)) {
            System.out.println("\nYou have succesfully logged in " + name + ".");
            boolean b = true;
            return b;
        } else {
            System.out.println("Sorry the password entered was incorrect, lets try again.");
            boolean f = false;
            return f;
        }
    }

        public void logout() {
        System.out.println("You have successfully logged out " + name);
        return;
    }

    }

