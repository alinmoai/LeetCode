class Solution {
    public void example () {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        pq.offer(1);
        pq.peek();
        pq.remove(1);
    }
}