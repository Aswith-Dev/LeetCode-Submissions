
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int num : asteroids) {
            boolean alive = true;

            while (alive && num < 0 && !st.isEmpty() && st.peek() > 0) {
                if (st.peek() < -num) {
                    st.pop();
                } else if (st.peek() == -num) {
                    st.pop();
                    alive = false;
                } else {
                    alive = false;
                }
            }

            if (alive) {
                st.push(num);
            }
        }

        int[] result = new int[st.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}
