package DSA.SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args){
        int n = 6;
        int[] arr = { 2,1,4,5,63,3 };
        bubbleSort(arr,n);
        printArray(arr, n);
    }
    // i=0:- j=5,4,3,2,1

    private static void bubbleSort(int[] arr,int n)
    {
        for(int i=0; i<n-1; i++){
            boolean isSwap = false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap){ // for already sorted array
                return;
            }
        }
    }

    private static void printArray(int[] arr, int n)
    {
      for(int i=0; i<n; i++){
          System.out.println(arr[i]);
      }
    }
}

// printing in ascending order
// time complexity is O(n^2)