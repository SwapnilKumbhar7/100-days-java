//Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
//Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
class Union_Sorted {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer>ar=new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                if(ar.size()==0 || ar.get(ar.size()-1)!=a[i]){
                    ar.add(a[i]);
                }
                i++;
            }
            else{
                if(ar.size()==0 || ar.get(ar.size()-1)!=b[j]){
                    ar.add(b[j]);
                }
                j++;
            }
        }
        while(i<a.length){
            if(ar.get(ar.size()-1)!=a[i]){
                ar.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(ar.get(ar.size()-1)!=b[j]){
                ar.add(b[j]);
            }
            j++;
        }
        return ar;
    }
     public static void main(String[] args) {
        Union_Sorted solution = new Union_Sorted();

        // Test case
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 5, 6};

        ArrayList<Integer> unionResult = solution.findUnion(a, b);

        System.out.println("Union of the two sorted arrays:");
        for (int num : unionResult) {
            System.out.print(num + " ");
        }
    }
}
