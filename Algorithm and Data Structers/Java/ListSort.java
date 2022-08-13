class Solution {
    public void example(List<String> list) {
        // 當長度一樣時按照字典順序排
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o2.length() - o1.length();
            }
        });
        
        return;
    }
}