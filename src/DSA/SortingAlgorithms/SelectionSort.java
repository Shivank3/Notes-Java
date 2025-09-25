package DSA.SortingAlgorithms;

public class SelectionSort
{
    public static void main(String[] args){
        int n = 5;
        int[] arr = { 2,1,4,6,5 };
        selectionSort(arr, n);
        printArray(arr,n);
    }

    private static void selectionSort(int[] arr, int n) {
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // efficient sort one by one once minIndex got a value.
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
