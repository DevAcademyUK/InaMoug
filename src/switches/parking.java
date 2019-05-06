package switches;

import java.util.Scanner;



public class parking {

    public static void main(String[] args) {


        parking p = new parking();
        p.getInput();
    }

    private void getInput() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println(" What day is it? ");
        String day = myScanner.nextLine();
        System.out.println(" How long you will staying? ");
        int duration = Integer.parseInt(myScanner.nextLine());
        System.out.println(" What position do you hold within the college? (Staff/Student/Visitor) ");
        String position = myScanner.nextLine();
        CalculateFees(day, duration, position);

    }

    private void CalculateFees(String day, int duration, String position) {
        int cost;
        int hourlyrate;
        int multiplier;

        switch (position) {
            case "Staff":
                multiplier = 2;
                break;

            case "Student":
                multiplier = 1;
                break;

            case "Visitor":
                multiplier = 3;
                break;

            default:
                System.out.println("" +
                        "Invalidd input for position, please retry");
                getInput();

        }

        switch (day) {
            case "Monday":
                hourlyrate = 2;
                break;

            case "Tuesday":
                hourlyrate = 2;
                break;

            case "Wednesday":
                hourlyrate = 3;
                break;

            case "Thursday":
                hourlyrate = 2;
                break;

            case "Friday":
                hourlyrate = 3;
                break;

            case "Saturday":
                hourlyrate = 4;
                break;

            case "Sunday":
                hourlyrate = 5;
                break;
        }

        cost = (hourlyrate * multiplier) * duration;
        System.out.println(" Thanks for parking  at Gateshead College, Please Pay: " + cost);

    }

}