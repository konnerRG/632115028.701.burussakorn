/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */

public class Doctor extends Person{
    int worktime;
    public Doctor(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void doctoring(){
        System.out.println(name+" has been a doctor for "+worktime+" years.");
    }
}
