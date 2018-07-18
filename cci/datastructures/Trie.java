package datastructures;

import java.util.HashMap;

public class Trie {
    public class Node {
        public static final char ROOT_CHAR = 0;

        public boolean isCompleteWord;
        public char character;
        public int allDecendants;
        public HashMap<Character, Node> children;

        public Node(char character) {
            this.character = character;
            this.children = new HashMap<>();
            this.allDecendants = 0;
        }
    }

    public Node root;

    public Trie() {
        this.root = new Node(Node.ROOT_CHAR);
    }

    public void add(String s) {
        Node node = this.root;
        node.allDecendants++;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!node.children.containsKey(c)) {
                node.children.put(c, new Node(c));
            }
            node = node.children.get(c);
            node.allDecendants++;
        }
        node.isCompleteWord = true;
    }

    public Node find(String s) {
        Node node = this.root;

        for(int i = 0; i < s.length() && node != null; i++) {
            char c = s.charAt(i);
            node = node.children.get(c);
        }
        return node;
    }
}