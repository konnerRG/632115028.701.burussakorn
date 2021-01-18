/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class Pets{
    String name;
    String species;
    String color;
    int age;
    
    public Pets(){}
    public Pets(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void showPetData(){
        System.out.println("-Name: "+name+"\n-Species: "+species+"\n-Color: "+color+"\n-Age: "+age+".");
    }
}