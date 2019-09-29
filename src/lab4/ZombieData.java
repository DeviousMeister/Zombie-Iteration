package lab4;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdIn;
import support.cse131.ArgsProcessor;
import java.awt.*;

public class ZombieData {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        String fileName = ap.nextString("File Name?");

        // TODO: 1. Prompt for the fileName and put it in the fileName variable
      
        // DONE: This will open the file
        In inFile = new In(fileName);   // Note that this assumes you're using the fileName variable!

        // TODO: 2. Read in the number of entities from the file
        int numEntities = inFile.readInt();
        // TODO: 3. Create the arrays that will hold entity data
        int[] type = new int[numEntities];
        double[] x = new double[numEntities];
        double[] y = new double[numEntities];
        // TODO: 4. Read in all the Entity data
        for(int i=0; i<numEntities; ++i){
            type[i]=inFile.readInt();
            x[i]=inFile.readDouble();
            y[i]=inFile.readDouble();
        }
        // TODO: 5. Iterate through all the data and display it using StdDraw
        for(int i=0; i<numEntities; ++i){
            if(type[i] == 1){
                StdDraw.setPenColor(Color.RED);
                StdDraw.filledCircle(x[i], y[i], 0.005);
            }
            else if (type[i] == 2){
                StdDraw.setPenColor(Color.BLACK);
                StdDraw.filledCircle(x[i], y[i], 0.005);
            }
        }
    }
}
