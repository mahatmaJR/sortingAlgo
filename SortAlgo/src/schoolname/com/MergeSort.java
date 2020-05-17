package schoolname.com;

public class MergeSort {
    void merge(int arr[], int left, int mid, int right) {
        int n1 = (mid - left) + 1;
        int n2 = right - mid;

        int Leftside[] = new int [n1];
        int Rightside[] = new int [n2];


        for (int i = 0; i < n1; i++)
            Leftside[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            Rightside[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (Leftside[i] <= Rightside[j]) {
                arr[k] = Leftside[i];
                i++;
            }
            else {
                arr[k] = Rightside[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = Leftside[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = Rightside[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr , m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

