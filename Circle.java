package CursorEducation;

import static java.lang.Math.pow;

public class Circle {
    public static double getArea(double radius) {
        return Math.PI * pow(radius, 2);

    }

    public static void main(String[] args) {
        double radius = 66.77;
        double getArea = getArea(radius);

        System.out.println(getArea);
    }
}
