import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Merge {
    public static void main(String args[]) {
        File file1 = new File(args[0]);
        File file2 = new File(args[1]);

        try {
            Scanner fScanner = new Scanner(file1);
            Scanner fScanner2 = new Scanner(file2);

            ArrayList<Integer> arr = new ArrayList<Integer>();

            while (fScanner.hasNextInt()) {
                arr.add(fScanner.nextInt());
            }

            int[] array1 = new int[arr.size()];
            for (int k = 0; k < arr.size(); k++)
                array1[k] = arr.get(k);

            arr.clear();

            while (fScanner2.hasNextInt()) {
                arr.add(fScanner2.nextInt());
            }

            int[] array2 = new int[arr.size()];
            for (int k = 0; k < arr.size(); k++)
                array2[k] = arr.get(k);


            Insertionsort(array1);
            sortReverse(array2);
            int[] mergedArray = mergeSort(array1, array2, 0, array1.length+array2.length-1);

            printStatements(array1,array2,mergedArray);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] mergeSort(int[] arr1, int[] arr2, int p, int r) {
        int[] A = new int[arr1.length + arr2.length];
        for(int k = 0; k< arr1.length;k++)
            A[k]=arr1[k];
        for(int k=0; k<arr2.length;k++)
            A[k+arr1.length]=arr2[k];
        mergeSort(A, p, r);
        return A;
    }

    private static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    private static void merge(int[] A, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = A[j];
                j++;
            } else if (j > high) {
                temp[n] = A[i];
                i++;
            } else if (A[i] > A[j]) {
                temp[n] = A[i];
                i++;
            } else {
                temp[n] = A[j];
                j++;
            }
            n++;
        }
        for (int k = low; k <= high; k++) {
            A[k] = temp[k - low];
        }
    }
    public static void Insertionsort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void sortReverse(int[] array){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i;
            while (j > 0 && array[j - 1] < key) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = key;
        }
    }

    public static void printStatements(int[] A, int[]B, int[]C){

        for(int k: A) {
            System.out.print(k);
            if( k!= A[A.length-1])
                System.out.print(" ");
        }
        System.out.println();

        for(int k: B) {
            System.out.print(k);
            if(k!= B[B.length-1])
                System.out.print(" ");
        }
        System.out.println();

        for(int k: C) {
            System.out.print(k);
            if(k!= C[C.length-1])
                System.out.print(" ");
        }
        System.out.println();


    }
}
