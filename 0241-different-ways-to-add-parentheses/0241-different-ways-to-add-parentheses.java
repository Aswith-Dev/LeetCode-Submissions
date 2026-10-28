import java.util.*;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            char operator = expression.charAt(i);

            if (operator == '+' || operator == '-' || operator == '*') {
                List<Integer> leftResults =
                    diffWaysToCompute(expression.substring(0, i));

                List<Integer> rightResults =
                    diffWaysToCompute(expression.substring(i + 1));

                for (int left : leftResults) {
                    for (int right : rightResults) {
                        if (operator == '+') {
                            results.add(left + right);
                        } else if (operator == '-') {
                            results.add(left - right);
                        } else {
                            results.add(left * right);
                        }
                    }
                }
            }
        }

        if (results.isEmpty()) {
            results.add(Integer.parseInt(expression));
        }

        return results;
    }
}