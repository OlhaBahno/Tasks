package task_chess;


public class Main {

    public static void main(String[] args)
    {
        Analyze analyze = new Analyze();
        Chess newChess = new Chess();

        System.out.println("Enter your height: ");
        newChess.setHeight(analyze.userWork());

        System.out.println("\nEnter your width: ");
        newChess.setWidth(analyze.userWork());

        newChess.draw();
    }


}
