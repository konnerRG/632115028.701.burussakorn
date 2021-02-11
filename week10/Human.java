/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class Human{
    public void hit(Animal animal){
        System.out.println(animal.roar());
    }

    public static void main(String[]args){
        Animal dog = new Dog();//Question 1.
        Human human = new Human();
        System.out.println("The first calling hit(Animal)");
        human.hit(dog);//Question 2.

        dog = new Fish();
        System.out.println("The second calling hit(Animal)");
        human.hit(dog);//Question 3.


    }
}