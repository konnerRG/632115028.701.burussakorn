/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */

public class Student extends Person{
    String subject;
    public Student(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void favSubject(){
        System.out.println(name+"'s favourite subject is "+subject+".");
    }
}
