package task_chess;
import java.util.Scanner;

public class Analyze
{

   public int getParam(String check){
       try{
           int result = Integer.parseInt(check);
           if(result <=0 ){
               System.out.println("It's not a positive digit. Try again: ");
               return 0;
           }
           else{
               System.out.println("Excellent!");
               return result;
           }

       }

       catch (NumberFormatException e){
           System.out.println("It's not digit. Try again: ");
           return -1;
       }

   }

    public int userWork() {
        Scanner s = new Scanner(System.in);
        int amount;
        do{
            amount = getParam(s.nextLine());
        }while(amount<=0);

        return amount;
    }
}
