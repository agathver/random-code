import java.util.Scanner;

public class TEST {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i;
        
        while((i = s.nextInt()) != 42) {
            System.out.println(i);
        }
    }
}