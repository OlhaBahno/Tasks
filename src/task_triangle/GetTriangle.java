package task_triangle;

import java.util.Scanner;

import static java.util.Locale.US;

public class GetTriangle {

    private final int AMOUNT_PAR = 4;
    private boolean isProblem;

    public String[] yourString() {

        String [] yourParam;
        do {
            isProblem = false;
            System.out.println("Enter your triangle. Use next scheme: " + "\n<Name>,<side №1>,<side №2>,<side №3>");

            Scanner sc = new Scanner(System.in).useLocale(US);
            String paramString = sc.nextLine().replaceAll("\\s+", "");
            yourParam = paramString.split(",");

            isProblem = isEnough(yourParam);

            if (!isProblem) {
                try {
                    isProblem = isPossibleCreate(yourParam);
                } catch (NumberFormatException e) {
                    System.out.println("Oops! Wrong parameters.\n");
                    isProblem = true;
                }
            }
        } while (isProblem);

        return yourParam;
    }


    public boolean isEnough(String [] yourParam) {
        if (yourParam.length < AMOUNT_PAR) {
            System.out.println("You've entered not enough parameters. Please, try it again.\n");
            return true;
        }

        if (yourParam.length > AMOUNT_PAR) {
            System.out.println("You've entered more parameters than program expects. Please, try it again.\n");
            return true;
        }

        if (yourParam.length == AMOUNT_PAR) {
            for (String s : yourParam) {
                if (s.equals("")) {
                    System.out.println("Perhaps,you've forgotten something. Please, try it again.\n");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isPossibleCreate(String [] yourParam) {
        if ((Double.parseDouble(yourParam[1]) + Double.parseDouble(yourParam[2]) < Double.parseDouble(yourParam[3]))
                || (Double.parseDouble(yourParam[1]) + Double.parseDouble(yourParam[3]) < Double.parseDouble(yourParam[2]))
                || (Double.parseDouble(yourParam[2]) + Double.parseDouble(yourParam[3]) < Double.parseDouble(yourParam[1]))) {
            System.out.println("It's impossible to create triangle with these sides. Please, try it again.\n");
            return true;
        } else {
            System.out.println("Triangle is created.\n");
            return false;
        }
    }

}
