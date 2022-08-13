class Solution {
    public void example () {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        // 一樣是從大到小
        pq = new PriorityQueue<>((a,b)->b-a);   
        pq.offer(1);
        pq.peek();
        pq.remove(1);
    }
}