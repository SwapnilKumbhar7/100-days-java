class Insertion_sort
{
  static void insert(int arr[],int i)
  {
       // Your code here
       int temp=arr[i--];
       while(i>=0 && temp<arr[i]){
           arr[i+1]=arr[i];
           i--;
       }
       arr[i+1]=temp;
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++){
          insert(arr,i);
      }
  }
}
