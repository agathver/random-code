import java.util.Scanner;

public class VILTRIBE
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        for(int i = 0; i < T; ++i) {
            char[] map = s.next().toCharArray();

            int a = 0;
            int b = 0;

            char current = 0;
            int currentCount = 0;

            for(char c : map) {
                switch(c) {
                    case '.':
                        currentCount++;
                        break;
                    case 'A':
                        a++;
                        if(current == 'a') {
                            a += currentCount;
                        } else {
                            current = 'a';
                        }
                        currentCount = 0;
                        break;
                    case 'B':
                        b++;
                        if(current == 'b') {
                            b += currentCount;
                        } else {
                            current = 'b';
                        }
                        currentCount = 0;
                    break;
                }
            }

            System.out.printf("%d %d\n", a,b);
        }
    }
}
