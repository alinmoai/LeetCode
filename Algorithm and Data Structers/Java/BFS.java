class Solution {
	public List<List<String>> bfs(List<Integer> startNodes, List<List<Integer>> graph, int answerIndex) {
		List<Integer> bfs = new ArrayList<Integer>(startNodes);

        boolean wayFinded = false;
        int step = 0;
        // 此範例的blockedNode 用來阻止造訪已經造訪過的點, 如果沒有此條件要把blockedNode拔掉
        boolean[] blockedNode = new boolean[graph.size()];

        // 透過BFS找出可能的路徑
        while (!wayFinded && bfs.size() != 0) {
            // System.out.println(bfs);
            Set<Integer> nextBfs = new HashSet<Integer>();
            for (int node : bfs) {
                for (int nextNode : graph.get(node)) {
                    if (nextNode == answerIndex) {wayFinded = true;}
                    if (!blockedNode[nextNode]) { 
                        paths[nextNode].add(node);
                        nextBfs.add(nextNode);
                    }
                }
            }
            
            for (Integer toBlock : nextBfs) {
                blockedNode[toBlock] = true;
            }
            bfs = new ArrayList<>(nextBfs);
            step++;
        }
	}
}