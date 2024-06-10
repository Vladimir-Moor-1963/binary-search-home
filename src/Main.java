import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = 10;
        int[] array = new int[length];
//
//
        for (int y = 0; y < array.length; y++) {
            array[y] = scanner.nextInt();
        }
        minSorting minSorting = new minSorting();
       array = minSorting.minSorting(array);

       int numberToFind = scanner.nextInt();
      int result = binary.binarySearch(array,numberToFind,0,array.length -1);

        System.out.println(result);



        // for (int j = 0; j < array.length; j++)

       // for (int j = 0; j < array.length; j++) {
       //     int min = array[j];
       //     int index = j;
//
       //     for (int i = j; i < array.length; i++) {
       //         if (array[i] < min) {
       //             min = array[i];
       //             index = i;
       //         }
       //     }
//
       //     int temp = array[j];
       //     array[j] = array[index];
       //     array[index] = temp;
//
//
       // }
       // System.out.println(Arrays.toString(array));
    }
}