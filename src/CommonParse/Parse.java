package CommonParse;

import java.util.Scanner;

public class Parse {

    public static double getParam(String param) {
        double result;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter " + param + ": ");

        do {
            while (!s.hasNextDouble()) {
                System.out.print("It's not digit. Try again: ");
                s.next();
            }
            result = s.nextDouble();
            if (result<=0){
                System.out.print("It's not a positive digit. Try again: ");
            }
        } while (result <= 0);

        System.out.println("Excellent! " + param.toUpperCase() + " = " + result);
        return result;
    }

    static public String getParamTicketString(String param){

        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + param + ": ");

        do {
            while (!scanner.hasNextInt()) {
                System.out.print("It's not digit. Try again: ");
                scanner.next();
            }
            result = scanner.nextLine();

            if (Integer.parseInt(result)<=0){
                System.out.print("It's not a positive digit. Try again: ");
            }

            else if(result.length() != 6){
                System.out.print("Only 6 digits.Try it again: ");
            }
        } while (Integer.parseInt(result) <= 0 || result.length() != 6);


        System.out.println("Excellent! " + param.toUpperCase() + " = " + result + "\n");
        return result;
    }
}
