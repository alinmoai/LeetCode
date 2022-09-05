class Solution {

	public List<List<String>> buildGraph(String beginWord, String endWord, List<String> wordList) {
		List<List<Integer>> graph = new ArrayList<List<Integer>>();
		// 建立文字間的路徑
        for (int i = 0; i < wordList.size(); i++) {
        	// 這段是建立起始字與words內文字的路徑, 因為此範例中起始字不存在在words中
            // if (hasPath(wordList.get(i), beginWord)) {
            //     paths[i].add(-1);
            //     blockedNode[i] = true;
            // }
                
            for (int j = i + 1; j < wordList.size(); j++) {
                if (hasPath(wordList.get(i), wordList.get(j))) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
	}

	//此範例的規則是 字與字中之間若不同的字數小於一個char 則兩個字之間存在雙向路徑
	private boolean hasPath(String word1, String word2) {
        
        int fault = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {fault++;}
            if (fault > 1) {
                // System.out.printf("%s, %s dontHasPath\n", word1, word2);
                return false;
            }
        }
        // System.out.printf("%s, %s hasPath\n", word1, word2);
        return true;
    }

    // n個node, 每個edge表示兩個node之間有雙向通道
    private boolean buildGraph2(int n, int[][] edges) {
        List<List<Integer>> graph;
        graph = new ArrayList();
        for (int i = 0; i < n; i++) { graph.add(new ArrayList<Integer>());}

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

    }
}