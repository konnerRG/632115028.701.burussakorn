/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */

public class Artist extends Person{
    String genre;
    public Artist(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void playMusic(){
        System.out.println(name+" likes to play "+genre+" music.");
    }
}
