package CursorEducation;

public class CountObjects {

    public static void main(String[] args) {
        B first = new B();
        B second = new B();
        B third = new B();
        B fourth = new B();
        B fifth = new B();
        System.out.println("There are " + B.count + " objects in this class!");
    }

    static class B {
        static int count;

        B() {
            count++;
        }
    }
}