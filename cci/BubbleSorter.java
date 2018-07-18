
/**
 * Write a description of class BubbleSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSorter
{
    public int bubbleSort(int[] a)
    {
        int swaps = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    swaps++;
                }
            }

        }
    }
    
    
}
