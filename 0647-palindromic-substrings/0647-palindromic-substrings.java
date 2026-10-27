
class Solution {
    public int countSubstrings(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            total += countPalindromes(s, i, i);
            total += countPalindromes(s, i, i + 1);
        }

        return total;
    }

    private int countPalindromes(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }

        return count;
    }
}
