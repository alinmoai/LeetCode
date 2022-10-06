public int find(int x) {
    if (parent[x] == x) {
        return x;
    }
    parent[x] = find(parent[x]);
    return parent[x];
}
    
public void union(int x, int y) {
    if (find(x) != find(y)) {
        parent[parent[y]] = parent[x];
    }
}