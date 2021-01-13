/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */

public class Engineer extends Person{
    String major;
    public Engineer(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void programming(){
        System.out.println(name+" majors in "+major+" engineering.");
    }
    
}
