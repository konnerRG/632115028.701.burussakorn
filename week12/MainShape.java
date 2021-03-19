/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */
public class MainShape {
    public static void main(String[]args){
        //Test Square.
        Shape square = new Square(12,4);
        square.getArea();
        //Test Triangle.
        Shape triangle = new Triangle(10,15);
        triangle.getArea();
        //Test Circle.
        Shape circle = new Circle(5);
        circle.getArea();
        

    }
}
