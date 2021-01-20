/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class TestInheritanceIII {
    public static void main(String[]args){
        Bicycle bike1 = new Bicycle(10);
        System.out.println("BIKE 1");
        bike1.checkSpeed();
        System.out.println("Bike1 speeds up twice.");
        bike1.speedup();
        bike1.speedup();
        bike1.checkSpeed();
        System.out.println("Bike1 brakes once.");
        bike1.brake();
        bike1.checkSpeed();

        System.out.println("");//Space.

        MountainBike bike2 = new MountainBike(15);
        System.out.println("BIKE 2");
        bike2.checkSpeed();
        System.out.println("Bike2 gears up to 5.");
        bike2.gearUp(3);
        bike2.gearUp(2);
        bike2.checkSpeed();
        System.out.println("Bike2 brakes twice.");
        bike2.brake();
        bike2.brake();
        bike2.checkSpeed();
    }
}
