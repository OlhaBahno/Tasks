package task_digits;

import CommonParse.Parse;

public class Main {

    public static void main(String[] args) {
        Converter c = new Converter();
        int yourDigit = (int)Parse.getParam("Digit");
        String result = c.convertNumberToWord(yourDigit);
        System.out.print(result);
    }
}
