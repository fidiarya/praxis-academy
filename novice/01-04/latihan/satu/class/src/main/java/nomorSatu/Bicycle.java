package nomorSatu;

class Bicycle2 {
    // the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;

    // the Bicycle class has
    // one constructor
    public Bicycle2(int startCadence, int startSpeed, int startGear) {
        cadence = startCadence;
        speed = startSpeed;
        gear = startGear;

        System.out.println("cadence : " + cadence);
        System.out.println("speed : " + speed);
        System.out.println("gear : " + gear);
        System.out.println("==========================");
    }

    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int applyBrake(int decrement) {
        speed -= decrement;
        return speed;
    }

    // public int getSpeed() {
    // return speed;
    // }

    public void speedUp(int increment) {
        speed += increment;
    }
}

public class Bicycle {

    public static void main(String[] args) {
        Bicycle2 obj1 = new Bicycle2(10, 50, 1);
        // Bicycle obj2 = new Bicycle(15, 30, 2);
        // obj1.applyBrake(10);
        System.out.println("speed = " + obj1.applyBrake(10));
    }

}