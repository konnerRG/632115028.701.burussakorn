/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class Dog extends Pets{
    String size;
    String hair;
    String runTo;

    //Object receive input from the user.
    public Dog(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    //Method Run.
    public void Run(String runTo){
        this.runTo = runTo;
        System.out.println("My dog "+name+" runs to the "+runTo+".");
    }
    //method Bark.
    public void Bark(String size){
        this.size = size;
        if(size.equals("small")){
            System.out.println(size+" bark: BOX BOX!");
        }
        else if(size.equals("medium")){
            System.out.println(size+" bark: Woof Woof!!");
        }
        else if(size.equals("large")){
            System.out.println(size+" bark: WOOF WOOF!!!");
        }
    }
    //Method to check the dog's hair.
    public void isShortHair(String hair){
        this.hair = hair;
        if(hair.equals("short")){
            System.out.println("Short hair: True");
        }
        else{
            System.out.println("Short hair: False");
        }
    }
}