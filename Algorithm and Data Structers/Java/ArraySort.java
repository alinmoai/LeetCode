class Solution {
    public void example () {
        int[][] array = new int[10][2];
        for (int i = 0; i < array.length; i++) {
            array[i][0] = i % 2;
            array[i][1] = i;
        }
        // array = [[0, 0], [1, 1], [0, 2], [1, 3], [0, 4], [1, 5].....]
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o2[1] - o1[1];
                }
                return o1[0] - o2[0];
            }
        });
    }
}