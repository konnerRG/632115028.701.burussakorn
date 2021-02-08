/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
class PrimeMinister extends Person{
    String country;

        public PrimeMinister(String name, int bornYear, String country){
            super(name, bornYear);
            this.country = country;
        }

        //Overriding method.
        public void introduce(){
            super.introduce();
            System.out.println("I'm the prime minister and work in "+country+".\n");
        }
}
