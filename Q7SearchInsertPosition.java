class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int x : nums) {
            list.add(x);
        }
        list.add(target);
        Collections.sort(list);
        Set<Integer> s = new LinkedHashSet<Integer>(list);  
        list.clear();
        list.addAll(s);
        int res = Collections.binarySearch(list, target);
        System.out.print(list);
        
        return res;
    }
}


// can use Binary_Search for this question.
