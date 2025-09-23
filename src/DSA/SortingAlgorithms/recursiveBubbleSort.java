package DSA.SortingAlgorithms;

public class recursiveBubbleSort {
    public static void main(String[] args){
        int n = 8;
        int[] arr = { 5,4,3,0,0,0,2,1 };
        recursiveBubble(arr, n);
        printArray(arr, n);
    }
     public static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

    private static void recursiveBubble(int[] arr, int n)
    {
        int didSwap = 0;
        if(n==1) return;
        for(int i=0; i<n-1; i++)
        {
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                didSwap = 1;
            }
        }
        if(didSwap == 0) return; // optimised if no swap happen then returns

        recursiveBubble(arr, n-1);
    }
}

// worst and average case O(n^2)
// best case O(n). size of the array
// space is O(N).