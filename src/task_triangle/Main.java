package task_triangle;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer;
        TreeSet<Triangle> ts = new TreeSet<Triangle>();

        do {
            GetTriangle analyze = new GetTriangle();
            String[] yourResult = analyze.yourString();

            Triangle triangle = new Triangle(yourResult[0], Double.parseDouble(yourResult[1]),
                    Double.parseDouble(yourResult[2]), Double.parseDouble(yourResult[3]));
            ts.add(triangle);

            System.out.println("\nDo you want to add another triangle?");
            answer = scanner.nextLine().toLowerCase();
        }
        while (answer.equals("y") || answer.equals("yes"));

        System.out.println("=========Triangles list=========");
        for (Triangle t : ts) {
            System.out.println("[Triangle " + t.getName() + "]: " + new BigDecimal(t.getSquare()).setScale(2,BigDecimal.ROUND_HALF_EVEN) + " cm");
        }



    }
}
