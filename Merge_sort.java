class Merge_sort {

    void merge(int arr[],int l,int mid,int r){
        int left=l;
        int right=mid+1;
        ArrayList<Integer>ar=new ArrayList<>();
        while(left<=mid && right<=r){
            if(arr[left]<arr[right]){
                ar.add(arr[left]);
                left++;
            }
            else{
                ar.add(arr[right++]);
            }
        }
        while(left<=mid){
            ar.add(arr[left++]);
        }
        while(right<=r){
            ar.add(arr[right++]);
        }
        for(int i=l;i<=r;i++){
            arr[i]=ar.get(i-l);
        }
    }
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
 public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        System.out.println("Given Array: " + Arrays.toString(arr));
        
        solution.mergeSort(arr, 0, n - 1);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
