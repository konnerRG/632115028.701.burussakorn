/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */

public class Musician extends Person{
    String instrument;
    public Musician(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void favInstrument(){
        System.out.println(name+" likes to play the "+instrument+".");
    }
}
