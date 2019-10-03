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
                for(int k=0; k<line.length(); k++) {
                    if (line.charAt(k) == ' '){
                        list.add(Integer.parseInt(num));
                        num = "";
                    }
                    else
                        num=num+line.charAt(k);
                }
                list.add(Integer.parseInt(num));
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
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

    }
}
