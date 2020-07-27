public class Solution2 {

    public int findMin(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        // 在区间 [left, right] 里查找目标元素
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                // 下一轮搜索区间 [mid + 1, right]
                left = mid + 1;
            } else {
                // 下一轮搜索区间 [left, mid]
                right = mid;
            }
        }
        return nums[left];
    }
}
