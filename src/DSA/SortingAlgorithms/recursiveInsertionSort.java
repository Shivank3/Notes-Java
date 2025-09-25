package DSA.SortingAlgorithms;

public class recursiveInsertionSort {
    public static void main(String[] args){
        int[] arr = { 2,41,88,3,9 };
        int n = arr.length;
        recursiveInsertionSort(arr,0, n);
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void recursiveInsertionSort(int[] arr,int i, int n) {
        // base case when recursion stops running
        if(i==n) return;

        int j = i;
        while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        recursiveInsertionSort(arr,i+1, n);
    }
}
