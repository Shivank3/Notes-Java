package DSA.SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args){
        int n = 5;
        int[] arr = { 2,1,4,9,4 };
        insertion(arr, n);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

    private static void insertion(int[] arr, int n) {
        for(int i=1; i<=n-1; i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}