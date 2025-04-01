class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
                if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];  // Output array
        Deque<Integer> deque = new LinkedList<>();  // Store indices of elements
        int index = 0;

        for (int i = 0; i < n; i++) {
            // Remove elements from front if they are out of window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements from back if they are smaller than current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current element at the back
            deque.offerLast(i);

            // Store the max in result array once we reach the first valid window
            if (i >= k - 1) {
                result[index++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
