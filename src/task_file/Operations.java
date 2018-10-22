package task_file;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Operations {

    private List<String> yourfile = new ArrayList<String>();
    private List<String> replacedfile = new ArrayList<>();
    private String fileName;
    /////"src/textfiles/" + fileName
    ////Paths.get("textfiles").toAbsolutePath().toString() + "\\" + fileName
    ////new File(fileName).getAbsolutePath()
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void readFile(){


        try(BufferedReader br = new BufferedReader(new FileReader
                (Paths.get("src/textfiles").toAbsolutePath().toString() + "\\" + fileName)))
        {
            String s;
            while((s=br.readLine())!=null){

                yourfile.add(s);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public int count(String yourString){

        int count =0;

        for (String s:yourfile) {
            if(s.contains(yourString)){
                int l = 0;

                int index;
                do{
                    index = s.indexOf(yourString,l);
                    if(index !=-1) {
                        count++;
                    }
                    else{
                        break;
                    }
                    l = index + yourString.length();
                }while(l<s.length());
            }

        }
        return count;
    }

    public void replace(String actual, String newWord){

        for (String s:yourfile) {

            if(s.contains(actual)){
                replacedfile.add(s.replaceAll(actual,newWord));
            }
            else{
                replacedfile.add(s);
            }
            //System.out.println(s);
        }
        writeFile();
        print();
    }

    public void writeFile(){
        try(FileWriter writer = new FileWriter(Paths.get("textfiles").toAbsolutePath().toString()
                + "\\" + fileName, false))
        {
            for (String s:replacedfile) {

                writer.write(s + "\r\n");
            }

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public void print(){
        System.out.println("Your previous file: ");
        for (String s:yourfile) {
            System.out.println(s);
        }
        System.out.println("\nYour new file: ");
        for (String s:replacedfile) {
            System.out.println(s);
        }
    }
}
