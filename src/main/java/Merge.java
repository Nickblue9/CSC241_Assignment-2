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


            for (Object k : array1)
                System.out.print(k + " ");
            System.out.println();
            for (Object k : array2)
                System.out.print(k + " ");
            System.out.println();
            System.out.println("---------------------------");


            InsertionSort.sort(array1);
            InsertionSort.sort(array2);

            for (Object k : array1)
                System.out.print(k + " ");
            System.out.println();
            for (Object k : array2)
                System.out.print(k + " ");
            System.out.println();
            System.out.println("---------------------------");

            int [] mergedArray = merge(array1,array2);

            for (Object k : mergedArray)
                System.out.print(k + " ");
            System.out.println();
            System.out.println("---------------------------");

            for (Object k : mergedArray)
                System.out.print(k + " ");
            System.out.println();
            System.out.println("---------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] merge(int[] arr1, int [] arr2) {
        int[] merged = new int[arr1.length + arr2.length];



        return merged;
    }

}
