package task_digits;

import java.util.*;

public class Converter {

    private String tens[] = new String[] {"Десять", "Двадцать", "Тридцать", "Сорок", "Пятьдесят", "Шестьдесят", "Семьдесят", "Восемьдесят", "Девяносто"};

    private Map<Integer, String> uniqueNumbers = Data.createMapWithUniqueNumbers();
    private Map<Integer, String> units = Data.createMapWithUnits();
    private int dividers[] = new int[]{2,3,6};


    String convertNumberToWord(int number){
        if (lengthOfNumber(number) > 10){
            return "You can convert number from 1 to billion";
        }
        return recursiveFind(number);
    }

    private int lengthOfNumber(int number) {
        String result = Integer.toString(number);
        return  result.length();
    }

    private int getCorrectDivider(int divider){
        if (divider == 10) {
            return divider;
        }

        int result = divider/10;
        int pow = lengthOfNumber(result) - 1;
        if (pow > dividers[dividers.length-1]){
            return (int)Math.pow(10,dividers[dividers.length-1]);
        }
        for(int i = 0; i<dividers.length-1;i++){
            if(pow>=dividers[i] && pow < dividers[i+1]){
                return (int)Math.pow(10,dividers[i]);
            }
        }
        return (int)Math.pow(10,1);
    }

    private String getWordEquivalent(int number) {

        if (number > 0 && number < 20){

            if (number == 10){
                return tens[0];
            }

            if (uniqueNumbers.containsKey(number)) {
                return uniqueNumbers.get(number);
            }
            else {

                return uniqueNumbers.get(number%10)+"надцать";
            }

        }
        else{
            return tens[number/10-1] +" "+uniqueNumbers.get(number%10);
        }
    }

    private String getUnitsName(int amount , int divider){

        String result = "";
        switch (divider){
            case 100:
                switch (amount){
                    case 1:
                        result = "Сто";
                        break;
                    case 2:
                        result = "Двести";
                        break;
                    case 3: case 4:
                        result = uniqueNumbers.get(amount)+"ста";
                        break;
                    default:
                        result = uniqueNumbers.get(amount)+"сот";
                        break;
                }
                break;
            case 1_000:
                switch (amount){
                    case 1:
                        result = units.get(divider)+"а";
                        break;
                    case 2: case 3: case 4:
                        result = units.get(divider)+"и";
                        break;
                    default:
                        result = units.get(divider);
                        break;
                }
                break;
            case 1_000_000:
                switch (amount){
                    case 1:
                        result = units.get(divider);
                        break;
                    case 2: case 3: case 4:
                        result = units.get(divider)+"а";
                        break;
                    default:
                        result = units.get(divider)+"ов";
                        break;
                }
                break;
            default:
                break;


        }
        return result;
    }


    private String recursiveFind(int number){
        int divider = getCorrectDivider((int)(Math.pow(10,lengthOfNumber(number))));

        if (divider == 10) {
            return getWordEquivalent(number);
        }

        if (divider == 100){
            return getUnitsName(number/divider,divider) + " " + recursiveFind(number%divider);
        }
        return recursiveFind(number/divider) +" " + getUnitsName(number/divider,divider) + " " + recursiveFind(number%divider);
    }

}

