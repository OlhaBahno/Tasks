package task_sequence;

public class Main {

    public static void main(String[] args) {

        Sequence s = new Sequence();
        ParseResult pr = new ParseResult();
        System.out.print("Enter minimal square: ");
        s.setMin_square(pr.userWork());
        System.out.print("\nEnter length of sequence: ");
        s.setLength_sequence(pr.userWork());

        int [] res = s.range();

        System.out.println("\nYour sequence: ");
        for(int i=0; i< res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
