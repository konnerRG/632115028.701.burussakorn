/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */

public class InheritanceExample {
    public static void main(String[]args){
        Artist art = new Artist("Ball",20,"Male");
        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

        Engineer engi = new Engineer("Korn",19,"Male");
        engi.major = "Software";
        engi.introduce();
        engi.programming();

        Doctor doc = new Doctor("Mangpor",28,"Female");
        doc.worktime = 2;
        doc.introduce();
        doc.doctoring();

        Musician music = new Musician("Wave", 19, "Male");
        music.instrument = "guitar";
        music.introduce();
        music.favInstrument();

        Student student = new Student("Angie",21,"Female");
        student.subject = "Drawing";
        student.introduce();
        student.favSubject();

        Teacher tch = new Teacher("Yam", 30, "Male");
        tch.university = "CMU";
        tch.introduce();
        tch.subject();
    }
}
