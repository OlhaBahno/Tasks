package task_triangle;

public class Triangle implements Comparable <Triangle>{

    private String name;
    private double a;
    private double b;
    private double c;
    private double square;

    Triangle(){
    }
    Triangle(String n, double s1, double s2, double s3){

        name = n;
        a = s1;
        b = s2;
        c = s3;
        this.square = getSquare();
    }

    public double getSquare() {

        double perimeter = a + b + c;
        double temp = Math.sqrt(perimeter/2 * (perimeter/2 - a) * (perimeter/2 - b) * (perimeter/2 - c));
        return temp;
    }

    public String getName() {

        return name;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int compareTo(Triangle t){

        if (square == t.getSquare()) {
            return 0;
        } else if (square > t.getSquare()) {
            return -1;
        } else {
            return 1;
        }
    }
}
