/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class Person {
    private String name;
    private int bornYear;

    
    public Person(String name, int bornYear){
       this.name = name;
       this.bornYear = bornYear;
    }
    
    public void introduce(){
        System.out.println("My name is "+name+".");
        System.out.println("I was born in "+bornYear+".");
    }

}

