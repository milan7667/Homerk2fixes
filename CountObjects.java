package CursorEducation;

public class CountObjects {

    public static void main(String[] args) {
        CountedOb first = new CountedOb();
        CountedOb second = new CountedOb();
        CountedOb third = new CountedOb();
        CountedOb fourth = new CountedOb();
        CountedOb fifth = new CountedOb();
        System.out.println("There are " + CountedOb.count + " objects in this class!");
    }

    static class CountedOb {
        static int count;

        CountedOb() {
            count++;
        }
    }
}