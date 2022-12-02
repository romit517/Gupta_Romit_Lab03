import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShortLister {

    public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter f){

        //Initializing an arrayList to store our results

        ArrayList<Object> result = new ArrayList<Object>();

        //For each loop to parse through each object in the file.

        for (Object ob : objects)
        {
            //Basically, checking if our filter allows the object to pass, then saving it to the result set.

            if(f.accept(ob)) {
                result.add(ob);
            }

        }

        return result;

    }

    public static void main(String[] args) throws FileNotFoundException {

        JFileChooser chooser = new JFileChooser();

        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){

            File file = chooser.getSelectedFile();

            Scanner scanner = new Scanner(file);

            ArrayList<Object> words = new ArrayList<Object>();


            while (scanner.hasNext()){
                words.add(scanner.next());
            }

            scanner.close();

            words = collectAll(words, new ShortWordFilter());

            //Printing the display out...

            System.out.println("Filtered List is as follows...\n");

            for (Object str : words){
                System.out.println(str);
            }

        }
    }
    
}