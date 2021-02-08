/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
class Sheriff extends Person{
    String workState;
    
        public Sheriff(String name, int bornYear, String workState){
            super(name, bornYear);
            this.workState = workState;
        }

        //Overriding Method
        public void introduce(){
            super.introduce();
            System.out.println("I'm a sheriff, working in "+workState+".\n");
        }
}
