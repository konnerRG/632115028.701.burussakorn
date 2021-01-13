/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */

public class Teacher extends Person{
    String university;
    public Teacher(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void subject(){
        System.out.println(name+" is a teacher in "+university+".");
    }
    
}
