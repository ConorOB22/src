/****
 ***** Created by CONOR O'BOYLE ON 23/02/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class InsertionSort
{
    public static void main(String[] args)
    {
    }//main
   public void insertionSort( int data[] ) {
      int in, out, temp;
      for (out=1; out < data.length; out++) {
         temp = data[out];
         for (in=out; in > 0 && data[in-1] >= temp; in--) {
            data[in] = data[in-1];
         }
         data[in] = temp;
      }
   }//insertionSort
}//class
