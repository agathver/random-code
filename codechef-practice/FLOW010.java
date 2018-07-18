import java.util.*;

public class FLOW010
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for(int i = 0; i < T; i++) {
            char c = s.next().charAt(0);

            switch(c) {
                case 'B':
                case 'b':
                    System.out.println("BattleShip");
                    break;
                case 'C':
                case 'c':
                    System.out.println("Cruiser");
                    break;
                case 'D':
                case 'd':
                    System.out.println("Destroyer");
                    break;
                case 'F':
                case 'f':
                    System.out.println("Frigate");
                    break;
            }
        }
    }
}
