class Sorted_Rotated {
    public boolean check(int[] nums) {
        int check=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                check++;
            }

        }
        if(nums[nums.length-1]>nums[0]){
            check++;
        }
        return check<=1;
    }
  public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(solution.check(nums1)); // Output: true

        // Test case 2
        int[] nums2 = {2, 1, 3, 4};
        System.out.println(solution.check(nums2)); // Output: false

        // Test case 3
        int[] nums3 = {1, 2, 3};
        System.out.println(solution.check(nums3)); // Output: true
    }
}
