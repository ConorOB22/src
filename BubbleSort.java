import java.util.Arrays;

/****
 ***** Created by CONOR O'BOYLE ON 23/02/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class BubbleSort
{
    public static void main(String[] args)
    {
    }//main

    public static void bubbleSort(int[] numbers) {
        int countComparisons = 0;
        int countSwaps=0;
        for (int out = numbers.length -1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if (numbers[in] > numbers [in+1]) {
                    int tmp = numbers[in]; //swap items
                    numbers[in] = numbers[in+1];
                    numbers[in+1] = tmp;
                    countComparisons++;
                    countSwaps++;
                }//if
            }//for
        }//for

        System.out.println("The sorted array is: "+ Arrays.toString(numbers));
        System.out.println("countComparisons: "+ countComparisons);
        System.out.println("countSwaps: "+ countSwaps);

    }//bubbleSort
}//class