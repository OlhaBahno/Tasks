package task_sequence;

public class Sequence {

    int minSquare;
    int lengthSequence;

    Sequence(){

    }
    Sequence(int min, int length){
        minSquare = min;
        lengthSequence = length;
    }

    public void setLength_sequence(int length_sequence) {
        this.lengthSequence = length_sequence;
    }

    public void setMin_square(int min_square) {
        this.minSquare = min_square;
    }

    public int [] range(){

        int [] resultRange = new int [lengthSequence];

        int count = (int)Math.ceil(Math.sqrt(minSquare));
        for(int i = 0 ; i < lengthSequence; i++){
            resultRange[i] = count;
            count++;
        }

        return resultRange;
    }
}
