class Solution {
    public void reverseString(char[] s) {
        List<Character> list = new ArrayList<Character>();
        
        for(char c : s) {
            list.add(c);
        }
        Collections.reverse(list);
        int i = 0;
        for(char c : list) {
            s[i] = c;
            i++;
        }
    }
}
