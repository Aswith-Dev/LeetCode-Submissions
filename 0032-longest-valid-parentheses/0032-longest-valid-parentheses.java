class Solution {
    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length()];
        int max = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = 2 + (i >= 2 ? dp[i - 2] : 0);
                } else {
                    int j = i - dp[i - 1] - 1;

                    if (j >= 0 && s.charAt(j) == '(') {
                        dp[i] = dp[i - 1] + 2;
                        if (j > 0) dp[i] += dp[j - 1];
                    }
                }

                max = Math.max(max, dp[i]);
            }
        }

        return max;
    }
}