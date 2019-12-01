package CursorEducation;

public class SumPositiveNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 4, 9, -7, 6, -5, 45, -25};
        int sum = 0;
        for (int t : arr) {
            if (t > 0) {
                sum += t;
            }
        }
        System.out.println("Сума додатніх чисел масиву рівна " + sum);
    }
}

