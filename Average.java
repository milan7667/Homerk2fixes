package CursorEducation;

public class Average {
    public static void main(String[] args) {
        double[] myArr = {6, 42, 3, 7};
        double sumAverage = 0;
        for (int x = 0; x < myArr.length; x++) {
            sumAverage = sumAverage + myArr[x] / 4;
        }
        System.out.println(sumAverage);
    }
}

