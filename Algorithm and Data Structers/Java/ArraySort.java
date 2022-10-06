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

        // 同樣功能 比較短的寫法
        Arrays.sort(event, (a, b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));

        Arrays.sort(stations, (a,b)-> {return a[0]-b[0];});

        Arrays.sort(nums, Collections.reverseOrder());

        // 如果只有一維的 int array 要轉換成integer才能用lambda去sort
        int[][] input = new int[][]{{3,1},{2,1}};
        Arrays.sort(input, (a,b) -> {return a[0] - b[0];});
    }

    public void arrayTrans() {
        int[] data = {1,2,3,4,5,6,7,8,9,10};

        // To boxed array
        Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
        Integer[] ever = IntStream.of( data ).boxed().toArray( Integer[]::new );

        // To boxed list
        List<Integer> you  = Arrays.stream( data ).boxed().collect( Collectors.toList() );
        List<Integer> like = IntStream.of( data ).boxed().collect( Collectors.toList() );
    }

    public int[] arrayAppend(int[] array, int[] append) {
         int[] newArray = Arrays.copyOf(array, array.length + append.length);
         for (int i = array.length; i < newArray.length) {
            newArray[i] = append[i-array.length];
         }
         return newArray;
    }

    Arrays.sort(idx, new Comparator<Integer>() {
        @Override public int compare(Integer o1, Integer o2) {
            if (cars[o1][1] == cars[o2][1]) {
                return cars[o2][0] - cars[o1][0];
            }
            return cars[o1][1] - cars[o2][1];
        }
    });
}