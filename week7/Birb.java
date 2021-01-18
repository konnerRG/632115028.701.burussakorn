/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class Birb extends Pets{
    String country;
    String canFly;

    //Object receive input from user.
    public Birb(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    //Method to let the bird speak.
    public void speak(){
        System.out.println(name+" said: Hi!!!");
    }
    //Method to check where the birb is.
    public void checkCountry(String country){
        this.country = country;
        System.out.println(name+" is at "+country+".");
    }
    //Method to check if it can fly.
    public void canFly(String canFly){
        this.canFly = canFly;
        if(canFly.equals("no")){
            System.out.println(name+" cannot fly.");
        }
        else{
            System.out.println(name+" can fly.");
        }
    }
}
