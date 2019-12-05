package CursorEducation;

public class Auto {

    public static int keepSpeed(int speed) {
        if (speed <= 60) {
            //keeping speed <= 80
            speed = speed + 20;
        } else speed = 80;
        return speed;
    }

    public static int getStateEngine(int state) {

        if (state == 1) {
            System.out.println("The auto is going now!");
        } else if (state == 2) {
            System.out.println("The engine is turned on now!");
        } else {
            System.out.println("The engine is turned off now!");
        }

        return state;
    }

    public static void main(String[] args) {
        int speed = 65;
        int keepSpeed = keepSpeed(speed);
        System.out.println(keepSpeed);
        int state = 1;
        int getStateEngine = getStateEngine(state);
        System.out.println(getStateEngine);
    }
}
