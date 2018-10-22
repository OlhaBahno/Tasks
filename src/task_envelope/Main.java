package task_envelope;

import CommonParse.Parse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        Envelope evn1 = new Envelope();
        Envelope evn2 = new Envelope();

        do {
            Analyze analyze = new Analyze();

            System.out.println("Envelope №1\n");
            evn1.setHeight(Parse.getParam("height"));
            evn1.setWidth(Parse.getParam("width"));

            System.out.println("\nEnvelope №2\n");
            evn2.setHeight(Parse.getParam("height"));
            evn2.setWidth(Parse.getParam("width"));

            if (analyze.compareEnvelopes(evn1,evn2) || analyze.compareEnvelopes(evn2,evn1)){
                System.out.println("Enclose envelope!");
            }
            else{
                System.out.println("Ooops! Envelopes don't match each other.");
            }

            System.out.println("\nDo you want to compare another two envelopes?");
            answer = scanner.nextLine().toLowerCase();
        }
        while (answer.equals("y") || answer.equals("yes"));
    }
}
