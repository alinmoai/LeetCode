// max tree
class SegmentTree {
    int n;
    int idxShift = 0;
    int[] array;
    
    SegmentTree(int size) {
        n = size;
        idxShift = 0;
        array = new int[2*n];
    }
    
    SegmentTree(int min, int max) {
        n = max - min + 1;
        idxShift = -min;
        array = new int[2*n];
        // System.out.printf("shift = %d, n = %d\n", idxShift, n);
    }

    public int getValue(int idx) {
        idx += idxShift + n;
        return array[idx];
    }
    
    public void update(int idx, int value) {
        idx += idxShift + n;
        array[idx] = Math.max(array[idx], value);
        for (int i = idx; i > 1; i >>= 1) {
            array[i >> 1] = Math.max(array[i], array[i ^ 1]);
        }
        // System.out.println(Arrays.toString(array));
    }

    public int getValue(int idx) {
        idx += idxShift + n;
        // System.out.println(idx);
        return array[idx];
    }

    public int getMax(int l, int r) {
        l += idxShift + n;
        r += idxShift + n;
        // System.out.printf("l = %d, r = %d, ", l, r);
        int ans = 0;
        for (; l < r; l >>= 1, r >>= 1) {
            if ((l & 1) == 1) {
                ans = Math.max(ans, array[l++]);    
            }
            
            if ((r & 1) == 1) {
                ans = Math.max(ans, array[--r]);
            }
        }
        // System.out.printf("ans = %d\n", ans);
        return ans;
    }
}

// sum tree
class SegmentTree {
        int n;
        int idxShift = 0;
        int[] array;
    
        SegmentTree(int size) {
            n = size;
            idxShift = 0;
            array = new int[2*n];
        }

        SegmentTree(int min, int max) {
            n = max - min + 1;
            idxShift = -min;
            array = new int[2*n];
            // System.out.printf("shift = %d, n = %d\n", idxShift, n);
        }

        public void update(int idx, int value) {
            idx += idxShift + n;
            array[idx] = Math.max(array[idx], value);
            for (int i = idx; i > 1; i >>= 1) {
                array[i >> 1] = array[i] + array[i ^ 1];
            }
            // System.out.println(Arrays.toString(array));
        }

        

        public int getSum(int l, int r) {
            l += idxShift + n;
            r += idxShift + n;
            // System.out.printf("l = %d, r = %d, ", l, r);
            int ans = 0;
            for (; l < r; l >>= 1, r >>= 1) {
                if ((l & 1) == 1) {
                    ans += array[l++];    
                }

                if ((r & 1) == 1) {
                    ans += array[--r];
                }
            }
            // System.out.printf("ans = %d\n", ans);
            return ans;
        }
    }