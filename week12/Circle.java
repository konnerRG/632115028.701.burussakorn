/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public void getArea(){
        double area;
        area = Math.PI*(Math.pow(radius, 2));
        System.out.println("Area of Circle: "+area+" unit^2");
    }
}
