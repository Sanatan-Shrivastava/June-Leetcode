class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < (n - 1); i++) {
            for(int j = 0; j < (n - i - 1); j++) {
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}


/* Not by Sorting: 
List<Integer> list_red = new ArrayList<>();
        List<Integer> list_white = new ArrayList<>();
        List<Integer> list_blue = new ArrayList<>();
        
        for(int i : nums) {
            if(i == 0) {list_red.add(i);}
            else if(i == 1) {list_white.add(i);}
            else {list_blue.add(i);}
        }
        list_red.addAll(list_white);
        list_red.addAll(list_blue);
        System.out.println(list_red);
        int c = 0;
        for(int x : list_red) {
            nums[c] = x;
            c++;
        }
*/        
