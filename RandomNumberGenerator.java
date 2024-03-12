import java.io.BufferedWriter;import java.io.FileWriter;import java.io.IOException;
import java.io.PrintWriter;import java.util.Random;

/****
 ***** Created by CONOR O'BOYLE ON 23/02/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class RandomNumberGenerator
{
    public static void main(String[] args) throws IOException
    {
        writer("BestCase[100]",100);

    }//main
      public static void writer(String fname, int size) throws IOException
      {
         FileWriter fw = new FileWriter(fname);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);
         Random random = new Random();

         for(int i = 0; i < 1000; i++){
           pw.println(random.nextInt(size) + 1);
         }//for

         pw.close();bw.close();fw.close();
      }//writer

    public static void getSortedArray(String fname, int size )
    {
        int[] sortedArray = new int[size];

        for (int i = 0; i < sortedArray.length; i++)
        {
            sortedArray[i] = i + 1;
        }

    }//getSortedArray

    public static int[] getUnsortedArray(int length) {
        int[] unsortedArray = new int[length];

        for(int i = 0; i<length; i++) {
            unsortedArray[i] = length - i;
        }
        return unsortedArray;
    }//unSortedArray
}//class