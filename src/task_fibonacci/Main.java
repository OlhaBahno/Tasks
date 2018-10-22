package task_fibonacci;

import CommonParse.Parse;

import java.util.Scanner;

public class Main{
        public static void main(String[] args) {

            intro();
            Fibonacci fib = new Fibonacci();
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();

            switch (choice){
                case 1:
                    caseFirst(fib);
                    break;
                case 2:
                    caseSecond(fib);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }

        public static void intro(){
            System.out.println("Hey! I'm glad to see you here." +
                    "\nInstruction:" +
                    "\n1.If you enter 1, you will need to enter a segment, " +
                    "where I could try to find Fibonacci numbers" +
                    "\n2.If you enter 2, you will need to enter only length of your desired Fibonacci numbers" +
                    "\n3.Enter another key, in order to exit." +
                    "\nGood luck!");

            System.out.print("\nEnter you choice: ");
        }

        public static void caseFirst(Fibonacci f){
            int min;
            int max;
            do{

                min = (int)Parse.getParam("min");
                max = (int)Parse.getParam("max");
                if(min>max){
                    System.out.println("\nYour min is larger that max.Try it again.");
                }

            }while(min>max);
            f.setBorder1(min);
            f.setBorder2(max);

            System.out.println("\nYour result:");
            for(int i = 0; i<f.numFib_BySegment().length;i++){
                System.out.print(f.numFib_BySegment()[i] + " ");
            }
        }

        public static void caseSecond(Fibonacci f){

            f.setLength((int)Parse.getParam("length"));
            System.out.println("\nYour result:");
            for(int i = 0; i<f.numFib_ByLength().length;i++){
                System.out.print(f.numFib_ByLength()[i] + " ");
            }
        }
}

