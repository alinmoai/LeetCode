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

    public void listToSrray(List<Foo> list) {
        Foo[] array = list.toArray(new Foo[0]);

        // or 
        // 要轉換的型態不同要用這個
        int[] example1 = list.stream().mapToInt(i->i).toArray();
    }
    
}