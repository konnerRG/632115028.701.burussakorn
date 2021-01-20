/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class bike{
    int speed;

    public bike(){}
    public bike(int speed){
        this.speed = speed;
    }
    //Checks the current speed of the bike.
    public void checkSpeed(){
        System.out.println("Current Speed: "+speed+" km/h");
    }
}