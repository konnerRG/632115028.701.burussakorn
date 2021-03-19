/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class Square extends Shape{
    private double length;
    private double width;

    public Square(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void getArea(){
        double area;
        area = length*width;
        System.out.println("Area of Square: "+area+" unit^2");
    }
}
