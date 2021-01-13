/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */

public class Person {
    String name;
    String gender;
    int age;

    public Person(){}
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void introduce(){
        System.out.println("my name is "+name+". I am "+age+" years old. I am a "+gender+".");
    }
}

