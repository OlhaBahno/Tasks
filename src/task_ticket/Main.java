package task_ticket;

import CommonParse.Parse;

public class Main {


    public static void main(String[] args) {

        Package package_tickets = new Package();
        String min_result;
        String max_result;
        do{
            min_result = Parse.getParamTicketString("min");
            max_result = Parse.getParamTicketString("max");
            if(Integer.parseInt(min_result) > Integer.parseInt(max_result)){
                System.out.println("Your min is larger than your max. Try it again: ");
            }

        }while(Integer.parseInt(min_result) > Integer.parseInt(max_result));

        package_tickets.setMin(min_result);
        package_tickets.setMax(max_result);
        package_tickets.Sort();
        System.out.println("Simple method: " + package_tickets.getLucky_BySimple() +
        "\n" + "Complicated method: " + package_tickets.getLucky_ByComplicated());
        System.out.println(package_tickets.winner());
    }
}
