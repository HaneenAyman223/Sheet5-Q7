

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        File haneen= new File("Haneen.txt");
        PrintWriter myprint = new PrintWriter(haneen);
        Random x = new Random();



        int i;
        for(i=0;i<100;i++)
        {
            int y = x.nextInt(100);
            myprint.print(y+" ");
        }

    }
}
