class Solution {
    int[] parentCount;
    List<Integer>[] graph;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        parentCount = new int[numCourses];
        graph = new List[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList();
        }
        
        for (int [] prerequisite : prerequisites) {
            graph[prerequisite[0]].add(prerequisite[1]);
            parentCount[prerequisite[1]]++;
        }
        
        Deque<Integer> dq = new LinkedList();
        int finished = 0;
        for (int i = 0; i < numCourses; i++) {
            if (parentCount[i] == 0) {
                dq.add(i);
                finished++;
            }
        }
        
        while(dq.size() > 0) {
            int cur = dq.poll();
            List<Integer> paths = graph[cur];
            for (int path : paths) {
                parentCount[path]--;
                if (parentCount[path] == 0) {
                    dq.add(path);
                    finished++;
                }
            }
        }
        return finished == numCourses;
    }
}