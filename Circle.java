package CursorEducation;

public class Circle {
    public static double area(double Pi, double radius) {
        double size = Pi * (radius * radius);
        return size;
    }

    public static void main(String[] args) {
        double radius = 66.77;
        double Pi = 3.14;
        double area = area(radius, Pi);

        System.out.println(area);
    }
}
