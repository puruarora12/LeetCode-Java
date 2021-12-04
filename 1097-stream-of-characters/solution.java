class StreamChecker {

    TrieNode root = new TrieNode();
    
    StringBuilder str = new StringBuilder();

    class TrieNode {
        TrieNode[] child;
        boolean isWord;

        TrieNode() {
            this.child = new TrieNode[26];
            this.isWord = false;
        }
    }

    public StreamChecker(String[] words) {
        for (String word : words) {
            insert(word);
        }
    }

   
    public boolean query(char letter) {
        str.append(letter);
        return search(str);
    }

   
    private void insert(String word) {
        TrieNode currNode = root;
        for (int i = word.length() - 1; i >= 0; i--) {
            int index = word.charAt(i) - 'a';
            if (currNode.child[index] == null) {
                currNode.child[index] = new TrieNode();
            }
            currNode = currNode.child[index];
        }
        currNode.isWord = true;
    }

    private boolean search(StringBuilder word) {
        TrieNode currNode = root;
        for (int i = word.length() - 1; i >= 0; i--) {
            int index = word.charAt(i) - 'a';
            if (currNode.child[index] == null) {
                return false;
            } else if (currNode.child[index].isWord) {
                return true;
            }
            currNode = currNode.child[index];
        }
        return currNode.isWord;
    }
}
