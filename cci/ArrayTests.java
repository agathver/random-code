import java.util.Arrays;
public class ArrayTests
{
    public static void main(String args[]) {
        int a[] = {1,2,4,5,6};
        System.out.println(Arrays.binarySearch(a, 1));
        System.out.println(~Arrays.binarySearch(a, 0));
        System.out.println(~Arrays.binarySearch(a, 7));
        System.out.println(~Arrays.binarySearch(a, 3));
    }
}
