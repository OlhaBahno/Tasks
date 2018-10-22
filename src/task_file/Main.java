package task_file;

public class Main {

    public static void main(String[] args){

        Operations operations = new Operations();

        args = new String[2];
        args[0] = "new.txt";
        args[1] = "ing";

        switch (args.length){
            case 1:
                introduction();
                break;
            case 2:
                operations.setFileName(args[0]);
                operations.readFile();
                System.out.println("Word " + args[1].toUpperCase() + " you can find "
                        + operations.count(args[1]) + " time(s)");
                break;
            case 3:
                operations.setFileName(args[0]);
                operations.readFile();
                operations.replace(args[1],args[2]);
                System.out.println("\nDone!");
                break;
            default:
                introduction();
                break;

        }
    }

    public static void introduction(){

        System.out.println("Hey, I'm glad to see you here!" +
                "\n1.Enter <name of your file,word> in order to count how many times you can find this word in your file" +
                "\n2.Enter <name of your file,old word,new word> in order to replace old word by new word." +
                "\nGood luck!");
    }
}
