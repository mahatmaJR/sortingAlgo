package schoolname.com;

public class InsertionSort {
    void insertionSort(int arr[]){
        int k = arr.length;
        for (int i = 1; i< k; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                int t = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = t;
                j--;
            }
        }
    }

    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
