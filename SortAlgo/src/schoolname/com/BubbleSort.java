package schoolname.com;

public class BubbleSort {
    void bubblesort(int arr[]){
        int m;
        int k = arr.length;

        for (int i = 0; i < k - 1; i++){
            for (int j = 0; j < k - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    m = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = m;
                }
            }
        }
    }

    void printArray(int k[]){
        int j = k.length;
        for (int i = 0; i < j - 1; i++)
            System.out.print(k[i] + " ");
        System.out.println();
    }
}
