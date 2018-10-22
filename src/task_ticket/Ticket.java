package task_ticket;

public class Ticket {

    private String number;
    private boolean isLucky;

    Ticket(){

    }

    Ticket(String num){

        number = num;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isLucky_BySimple(){
        String [] check = getNumber().split("");

        if(Integer.parseInt(check[0]) + Integer.parseInt(check[1]) + Integer.parseInt(check[2]) ==
                Integer.parseInt(check[3]) + Integer.parseInt(check[4]) + Integer.parseInt(check[5])){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isLucky_ByComplcatited(){
        String [] check = getNumber().split("");

        int sum_Even = 0;
        int sum_Odd = 0;

        for(int i=0; i<check.length;i++){
            if(Integer.parseInt(check[i])%2 == 0){
                sum_Even++;
            }
            else{
                sum_Odd++;
            }
        }

        if(sum_Even == sum_Odd){
            return true;
        }
        else{
            return  false;
        }
    }

}
