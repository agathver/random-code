import java.util.Scanner;
/**
 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
 */
public class MakingAnagramns
{
    public static void main(String args[]) {
        int[] freq = new int[26];
        
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            freq[c - 'a']++;
        }
        
        for(int j = 0; j < b.length(); j++) {
            char c = b.charAt(j);
            freq[c - 'a']--;
        }
        
        int deletions = 0;
        for(int i = 0; i < 26; i++) {
            deletions += Math.abs(freq[i]);
        }
        
        System.out.println(deletions);
    }
}
