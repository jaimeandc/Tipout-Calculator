package tipcalculator;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        boolean again = true;
        while (again) {
            Scanner user = new Scanner(System.in);
            System.out.println("Please enter your total Sales.");
            double sales = user.nextDouble();
            System.out.println("Please enter your total Non-Alcohol Sales.");
            double na = user.nextDouble();
            System.out.println("Please enter your total Beer Sales.");
            double beer = user.nextDouble();
            System.out.println("Please enter your total Liquor Sales.");
            double wine = user.nextDouble();
            System.out.println("Please enter your total Wine Sales.");
            double liquor = user.nextDouble();
            System.out.println("Would you like to try again ('Y'/'N')");
            String replay = user.nextLine();
            tipout(sales, na, beer, wine, liquor);
            if (replay.equals("N")) {
                System.out.println("I know i wish i made more too.");
                again = false;
            }
        }

    }//end of main

    public static void tipout(double sales, double na, double beer,double wine, double liquor) {
        double takeout_pc;
        double b = na + beer + wine + liquor;
        double t = sales - b;
        double bar = b * .05;
        double takeout = t * .03;
        System.out.print("You gotta tipout $" + takeout + " to takeout, and $" + bar + " to the bar.");
    }//end of tipout method

}//end of class
