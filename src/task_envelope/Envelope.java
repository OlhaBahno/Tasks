package task_envelope;

public class Envelope{

    private double height;
    private double width;

    Envelope(){

    }

    Envelope(double h, double w) {
        height = h;
        width = w;

    }

    public double getHeight() {

        return height;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double w) {

        this.width = w;
    }

    public void setHeight(double h) {

        this.height = h;
    }
}
