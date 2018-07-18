import java.util.Scanner;

import datastructures.*;

class Contacts {
    private static int countChildren(Trie.Node node) {
        if(node == null) {
            return 0;
        }
        int sum = 0;
        if(node.isCompleteWord) {
            sum += 1;
        }
        for (Trie.Node n : node.children.values()) {
            sum += countChildren(n);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Trie trie = new Trie();

        for(int i = 0; i < n; i++) {
            String command = s.next();
            String arg = s.next();

            switch(command) {
                case "add":
                    trie.add(arg);
                    break;
                case "find":
                    Trie.Node node = trie.find(arg);
                    System.out.println(node.allDecendants);
                    break;
            }
        }
    }
}