package CursorEducation;

public class Average1 {
    public static void main(String[] args) {
        double [] myArr = {6, 42, 3, 7};
        double sumAverage = 0;
        for (int x = 0; x < myArr.length; x++) {
            sumAverage = sumAverage + myArr[x] / myArr.length;
        }
        System.out.println(sumAverage);
    }
}


