/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class MountainBike extends bike{
    int gear;
    //sub-Oject to receive speed as an input.
    public MountainBike(int speed){
        this.speed = speed;
    }
    //A method to multiply speed.
    public void gearUp(int gear){
        this.gear = gear;
        speed += gear*5;
    }
    //A method to reduce speed by 5.
    public void brake(){
        speed -= 5;
    }
}
