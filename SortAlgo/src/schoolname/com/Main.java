package schoolname.com;

public class Main {

    public static void main(String[] args) {
        int arr[] = {106, 97, 60, 134, 25, 28, 51, 111};

        System.out.println("\nGiven Array" + arr);
        //Bubble Sort
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Sorted Using BubbleSort Algorithm");
        bubbleSort.bubblesort(arr);
        bubbleSort.printArray(arr);

        //Insertion Sort
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("\nSorted Using InsertionSort Algorithm");
        insertionSort.insertionSort(arr);
        insertionSort.printArray(arr);

        //Quick Sort
        QuickSort quickSort = new QuickSort();
        System.out.println("\nSorted Using QuickSort Algorithm");
        int n = arr.length;
        quickSort.sort(arr, 0, n - 1);
        quickSort.printArray(arr);

        //Merge Sort
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length-1);
        System.out.println("\nSorted Using MergeSort Algorithm");
        mergeSort.printArray(arr);
    }
}
