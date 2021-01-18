/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class Fish extends Pets{
    String size;
    String habitat;
    
    //Object receive input from user.
    public Fish(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    //Method to check whether the fish can swim in seawater or not.
    public void isSwimToSea(String habitat){
        this.habitat = habitat;
        if(habitat.equals("seawater")){
            System.out.println("Swims to the sea: True");
        }
        else if(habitat.equals("freshwater")){
            System.out.println("Swims to the sea: False");
        }
    }
    //method to determine the size of the fish relative to it's speed.
    public void Swim(String size){
        this.size = size;
        if(size.equals("small")){
            System.out.println(name+" is "+size+" and swims very fast.");
        }
        else if(size.equals("medium")){
            System.out.println(name+" is "+size+" and swims slowly.");
        }
        else if(size.equals("large")){
            System.out.println(name+" is "+size+" and swims very slowly.");
        }
    }
}
