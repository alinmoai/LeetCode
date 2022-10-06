class Trie {
    
    boolean isWord = false;
    int wordCount = 0;
    Trie[] nextTrie = new Trie[26];
    
    public Trie() {
        
            
    }
    
    public void insert(StringBuilder sb, int idx) {
        if (idx == sb.length()) {
            isWord = true;
            wordCount++;
            return;
        }
        
        if (nextTrie[sb.charAt(idx) - 'a'] == null) {
            nextTrie[sb.charAt(idx) - 'a'] = new Trie();
            wordCount++;
        }
        nextTrie[sb.charAt(idx) - 'a'].insert(sb, idx + 1);
    }
    
    public Trie find(StringBuilder sb, int idx) {
        if (idx == sb.length()) {return this;}
        if (nextTrie[sb.charAt(idx) - 'a'] == null) {
            return null;
        }
        return nextTrie[sb.charAt(idx) - 'a'].find(sb, idx + 1);
    }
}