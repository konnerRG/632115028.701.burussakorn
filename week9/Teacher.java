/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
class Teacher extends Person{
    String workState;

        public Teacher(String name, int bornYear, String workState){
            super(name, bornYear);
            this.workState = workState;
        }

        //Overriding method.
        public void introduce(){
            super.introduce();
            System.out.println("I'm a teacher, teaching students at "+workState+".\n");
        }

}
