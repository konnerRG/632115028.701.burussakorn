/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class Bicycle extends bike{
    //sub-Oject to receive speed as an input.
    public Bicycle(int speed){
        this.speed = speed;
    }
    //Speeds up the bike by 5 km/h.
    public void speedup(){
        speed += 5;
    }
    //Slows down the bike by 5km/h.
    public void brake(){
        speed -= 5;
    }
}
