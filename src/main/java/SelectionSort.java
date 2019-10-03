import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]) {
        File f = new File((args[0]));
        try {
            SelectionSort sort = new SelectionSort();
            Scanner fScanner = new Scanner(f);

            ArrayList<Integer> list = new ArrayList();
            while (fScanner.hasNext()) {
                String line = fScanner.nextLine();
                String num="";
                int crawler = 0;
                while(true){
                    if(line.charAt(crawler)==' '){
                        list.add(Integer.parseInt(num));
                        num="";
                    }
                    else
                        num=num+line.charAt(crawler);
                    crawler++;

                    if(crawler==line.length())
                        break;
                }
            }
            fScanner.close();

            int[] array = new int[list.size()];
            for(int k= 0; k<list.size(); k++){
                array[k] = list.get(k);
            }

            sort.selectionSort(array);

            for(int k:array)
                System.out.println(k);

        }catch(IOException e){e.printStackTrace();}
    }

    private void selectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

    }
}
