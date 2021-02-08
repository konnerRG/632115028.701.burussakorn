/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
class Football extends Person{
    String club;

        public Football(String name, int bornYear, String club){
            super(name, bornYear);
            this.club = club;
        }

        //Overriding method.
        public void introduce(){
            super.introduce();
            System.out.println("I'm a football player and working in "+club+" football club.\n");
        }
}
