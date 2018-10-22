package task_envelope;

public class Analyze {

    public boolean compareEnvelopes(Envelope a, Envelope b)
    {
        if((a.getHeight() > b.getHeight() && a.getWidth() > b.getWidth()) ||
                (a.getHeight() > b.getWidth() && a.getWidth() > b.getHeight())) {
            return true;
        }
        else{
            return false;
        }
    }
}