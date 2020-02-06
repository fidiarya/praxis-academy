package nomorSatu;

public class MountainBike extends Bicycle2 {

    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;

        System.out.println("Tinggi : " + startHeight);
        System.out.println("Irama : " + startCadence);
        System.out.println("Speed : " + startSpeed);
        System.out.println("Gear : " + startGear);
    }

    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public static void main(String[] args) {
        MountainBike spd1 = new MountainBike(120, 10, 30, 5);
    }
}