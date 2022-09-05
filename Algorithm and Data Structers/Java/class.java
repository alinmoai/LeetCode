class Node{
    int cMax;
    long cost;
    long singleCost;
    int i;
    
    Node(int cMax, long singleCost, long cost, int i) {
        this.cMax = cMax;
        this.cost = cost;
        this.i = i;
        this.singleCost = singleCost;
    }
    
    public String toString() {
        return "{cMax: " + cMax + ", cost: " + cost + ", i: " + i + ", singleCost: " + singleCost + "}";
    }
}