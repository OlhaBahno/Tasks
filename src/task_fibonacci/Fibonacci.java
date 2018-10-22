package task_fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private int border1;
    private int border2;
    private int length;

    public void setBorder1(int border1) {
        this.border1 = border1;
    }

    public void setBorder2(int border2) {
        this.border2 = border2;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBorder1() {
        return border1;
    }

    public int getBorder2() {
        return border2;
    }

    public int [] numFib_BySegment() {

        int [] result;
        List<Integer> range = new ArrayList<Integer>();

        for (int i = 1, sum = 2; sum <= border2; sum += i, i = sum - i) {
            if (sum >= border1) {
                range.add(sum);
            }
        }

        result = new int[range.size()];
        for (int i = 0; i < range.size(); i++) {
            result[i] = range.get(i);
        }
        return result;
    }

    public int [] numFib_ByLength(){

        int previous = 1;
        int next = 1;

        int [] result;
        List<Integer> range = new ArrayList<Integer>();
        for (int i = 2; ; i++) {
            next = previous + next;
            previous = next - previous;
            if(Integer.toString(next).length() == length){
                range.add(next);
            }
            else if (Integer.toString(next).length() > length){
                break;
            }
        }

        result = new int[range.size()];
        for (int i = 0; i < range.size(); i++) {
            result[i] = range.get(i);
        }
        return result;
    }
}
