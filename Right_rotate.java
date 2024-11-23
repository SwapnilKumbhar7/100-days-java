class Right_rotate{
    private static void swap(int[] nums,int i,int j){
        while(i<=j){
            int temp=nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
            }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k==0){
            return;
        }
        int i=0,j=nums.length;
        swap(nums,i,j-1);
        swap(nums,i,k-1);
        swap(nums,k,j-1);


    }
}
public class Main {
    public static void main(String[] args) {
        Right_rotate solution = new Right_rotate();
        
        // Test case
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        System.out.println("Original array: ");
        printArray(nums);
        
        solution.rotate(nums, k);
        
        System.out.println("Rotated array: ");
        printArray(nums);
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
