package CursorEducation;

import java.util.Arrays;

public class DuplicateToZero {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 4, 2, 8, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int t = i + 1; t < arr.length; t++) {
                if (arr[i] == arr[t]) {
                    arr[t] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}