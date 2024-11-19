class Selection
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        return min;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n-1;i++){
	        int min=select(arr,i);
	        int temp=arr[i];
	        arr[i]=arr[min];
	        arr[min]=temp;
	    }
	}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Input array
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        
        System.out.println("Original array:");
        printArray(arr);
        
        // Sorting the array
        sol.selectionSort(arr, n);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
    
    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

}
