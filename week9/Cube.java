/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
class Cube extends Rectangle{
    private int length;

    public Cube(int width, int height, int length){
        super(width, height);
        this.length = length;
    }
    public String toString(){
        return "This is a cube with the side of "+length;
    }
}
