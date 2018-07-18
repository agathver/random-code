import java.util.Scanner;
import java.util.Arrays;
/**
 * https://www.hackerrank.com/challenges/ctci-find-the-running-median/problem
 */
public class RunningMedian
{
    static int[] insert(int e, int a[], int pos, int length) {
        for(int i = length - 1; i > pos; i--) {
            a[i] = a[i-1];
        }
        a[pos] = e;
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            int e = in.nextInt();
            int ins = Arrays.binarySearch(a, 0, i, e);
            if(ins < 0) {
                ins = ~ins;
            }
            insert(e, a, ins, i);
            float median = 0;
            if(i % 2 == 0) {
                median = a[(i + 1) / 2];
            } else {
                median = (a[i / 2] + a[(i + 1)/2]) / 2.0f;
            }
            System.out.printf("%.1f\n", median);
        }
    }
}
