/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
class Basketball extends Person{
    String team;
        public Basketball(String name, int bornYear, String team){
            super(name, bornYear);
            this.team = team;
        }
        
        //Overriding method.
        public void introduce(){
            super.introduce();
            System.out.println("I'm a basketball player working for "+team+".\n");
        }
}
