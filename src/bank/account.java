package bank;

import java.util.Scanner;

public class account {

    private String userPass;
    private String userName;

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        account lg = new account();
        lg.login();

    }

    private void login() {
        System.out.println(" Enter User password: ");
        String userPass = myScanner.nextLine();
        System.out.println(" Enter user name: ");
        String userName = myScanner.nextLine();
    }

    private void selectAccount() {
        System.out.println(" Please select one of your accounts. ");
        String account = myScanner.nextLine();

        if(account.equalsIgnoreCase( "current")) {
            selectCurrent();
        }
        else if(account.equalsIgnoreCase("personal"){
            selectPersonal();
        }
    else if(account.equalsIgnoreCase( "savings")){
            selectSavings();
        }
    selectAccount();
    }
    private int balance;
    private int deposit;
    private int withdraw;

    private void selectCurrent() {


        System.out.println(" Your current balance is: " );
        String balance = myScanner.nextLine();

        System.out.println("how much would you like to deposit?");
        int deposit = int.parseInt(myScanner.nextLine());
        balance += deposit;

        System.out.println("how much would you like to withdraw ?");
        int withdraw = int.parseInt(myScanner.nextLine());
        if(withdraw <= balance) {
            balance -= withdraw;
        }
    }

    private void selectPersonal() {

        }

    private void selectSavings() {

    }
}