package task_ticket;

public class Package {

    private String min;
    private String max;
    private int lucky_BySimple = 0 ;
    private int lucky_ByComplicated = 0;

    Package(){

    }

    Package(String min, String max){
        this.min = min;
        this.max = max;
    }

    public int getLucky_ByComplicated() {
        return lucky_ByComplicated;
    }

    public int getLucky_BySimple() {
        return lucky_BySimple;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public void Sort(){

        Ticket t = new Ticket();
        for(int i = Integer.parseInt(min); i <= Integer.parseInt(max); i++){

            String add = "";
            int zeros = 6 - Integer.toString(i).length();

            for(int j = 0;j < zeros;j++){
                add += "0";
            }

            t.setNumber(add+i);
            if(t.isLucky_BySimple()){
                lucky_BySimple++;
            }
            if(t.isLucky_ByComplcatited()){
                lucky_ByComplicated++;
            }
        }
    }

    public String winner(){

        if(lucky_BySimple > lucky_ByComplicated){
            return "\nSimple method is winner";
        }
        else if(lucky_ByComplicated == lucky_BySimple){
            return "\nEqual!";
        }
        else{
            return "\nComplicated method is winner";
        }
    }

}
