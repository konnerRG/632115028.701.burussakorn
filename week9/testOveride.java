/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class testOveride {
    public static void main(String[]args){
        //Test program1.
        Person person1 = new Person("Korn",2001);
        person1.introduce();
        System.out.println(" ");

        Sheriff person2 = new Sheriff("Mateo",1998,"California");
        person2.introduce();

        Teacher person3 = new Teacher("Ball", 1977, "CMU");
        person3.introduce();

        PrimeMinister person4 = new PrimeMinister("Tu", 1954, "Thailand");
        person4.introduce();

        Football person5 = new Football("Messi", 1987, "Barcelona");
        person5.introduce();

        Basketball person6 = new Basketball("Kobe Bryant", 1978, "LA Lakers");
        person6.introduce();

        //Test program3.
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());
        
        Rectangle shape2 = new Rectangle(25, 30);
        System.out.println(shape2.toString());

        Cube shape3 = new Cube(25, 30, 35);
        System.out.println(shape3.toString());
    }
}
