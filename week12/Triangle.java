/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }

    public void getArea(){
        double area;
        area = 0.5*base*height;
        System.out.println("Area of Triangle: "+area+" unit^2");
    }
}
