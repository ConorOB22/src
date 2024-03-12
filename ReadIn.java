import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/****
 ***** Created by CONOR O'BOYLE ON 23/02/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class ReadIn
{
    public static void main(String[] args)
    {
    }//main

    public static int getNumberOfLines(String fileName) throws IOException
    {
        try
        {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            int numberOfLines = 0;

            while (s != null)
            {
                numberOfLines++;
                s = br.readLine();
            }//while
            return numberOfLines;
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }//getNumberOfLines

    public static int[] readInLines(int numberOfLines,String fileName) throws IOException
    {

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        int [] number = new int [numberOfLines];

        for (int i = 0; i < number.length; i++) {
            String s = br.readLine();
            int currentLineNumber = Integer.parseInt(s);
            number[i] = currentLineNumber;
        }
        br.close(); // close buffered reader stream
        fr.close(); // close the file stream
        return number;
    }//readInLines
}//class
