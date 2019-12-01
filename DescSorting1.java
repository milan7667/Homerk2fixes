package CursorEducation;

import java.util.Arrays;
import java.util.Collections;

public class DescSorting1 {
    public static void main(String[] args) {
        Integer[] array = {10, 2, 10, 3, 1, 2, 5, 100, 200, 99, 83};
        Arrays.sort(array);
        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}