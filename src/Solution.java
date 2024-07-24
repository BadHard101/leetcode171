class Solution {
    // AAA
    public int titleToNumber(String columnTitle) {
        int counter = 0;
        int ans = 0;
        for (int i = columnTitle.length()-1; i >= 0; i--) {
            char temp = columnTitle.charAt(i);
            ans = ans + (int) (temp - 'A' + 1) * (int) Math.pow(26, counter++);
        }
        return ans;
    }
}