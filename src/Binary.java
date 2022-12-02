public class Binary {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 2;

        boolean found = binarySearch(nums, 0, nums.length - 1, 2);
        System.out.println("Is " + n + " in the list? " + found);
    }

    public static boolean binarySearch(int[] nums, int low, int high, int target) {
        if (low > high)
            return false;
        else {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (target < nums[mid]) {
                return binarySearch(nums, low, mid - 1, target);
            } else {
                return binarySearch(nums, mid + 1, high, target);
            }
        }
    }
}