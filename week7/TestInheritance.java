/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
 public class TestInheritance{
     public static void main(String[]args){
        Dog bo = new Dog("Bo","Labrador Retriever","brown",2);
        System.out.println("\nMY DOG");
        bo.showPetData();
        bo.Run("owner");
        bo.Bark("large");
        bo.isShortHair("short");

        Fish nemo = new Fish("Nemo","Clownfish","orange",1);
        System.out.println("\nMY FISH");
        nemo.showPetData();
        nemo.isSwimToSea("seawater");
        nemo.Swim("small");

        Birb jayden = new Birb("Jayden","Jaybird","blue",3);
        System.out.println("\nMY BIRD");
        jayden.showPetData();
        jayden.speak();
        jayden.checkCountry("Brazil");
        jayden.canFly("yes");
     }
 }