import java.util.ArrayList;

public class InsertionSort {
    public static void sortLow(int[] array) {
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

    public static void sortHigh(int[] array){
        for (int j = array.length-1; j>1; j--){
            int key = array[j];
            int i = j-1;
            while(i>=0 && array[i]>key){
                array[i+1]=array[i];
                i--;
            }
            array[i+1]=key;
        }
    }
}