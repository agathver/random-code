import java.util.Scanner;

public class FLOW014
{
    // instance variables - replace the example below with your own
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for(int i = 0; i < T; i++) {
            
            int hardness = s.nextInt();
            float carbon = s.nextFloat();
            int ts = s.nextInt();
            
            int grade = 5;
            
            boolean a = hardness > 50;
            boolean b = carbon < 0.7f;
            boolean c = ts > 5600;
            
            if (a && b && c) {
                grade = 10;
            } else if(a && b) {
                grade = 9;
            } else if(b && c) {
                grade = 8;
            } else if(a && c) {
                grade = 7;
            } else if(a || b || c) {
                grade = 6;
            }
            
            System.out.println(grade);
        }
    }
}
