import java.util.Arrays;

public class HeapSort {

    public void sort(int arrA[]) {
        int size = arrA.length;

        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(arrA, size, i);

        for (int i=size-1; i>=0; i--) {

            int x = arrA[0];
            arrA[0] = arrA[i];
            arrA[i] = x;

            heapify(arrA, i, 0);
        }
    }

    void heapify(int arrA[], int heapSize, int i) {
        int largest = i; 
        int leftChildIdx  = 2*i + 1;
        int rightChildIdx  = 2*i + 2;

        if (leftChildIdx  < heapSize && arrA[leftChildIdx ] > arrA[largest])
            largest = leftChildIdx ;

        if (rightChildIdx  < heapSize && arrA[rightChildIdx ] > arrA[largest])
            largest = rightChildIdx ;

        if (largest != i) {
            int swap = arrA[i];
            arrA[i] = arrA[largest];
            arrA[largest] = swap;

            heapify(arrA, heapSize, largest);
        }
    }

    public static void main(String args[]) {
        int arrA[] = {15,23,18,63,36,21,66,12,42,35,75,23,64,78,39};

        System.out.println("Original array is: " + Arrays.toString(arrA));
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arrA);

        System.out.println("Sorted array is (Heap Sort): " + Arrays.toString(arrA));
    }
}