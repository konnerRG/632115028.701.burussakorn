public class TestCircle {
    public static void main(String[]args){
        Circle cir1 = new Circle(2.0,0.0,0.0);
        System.out.println("Area of cir1 = "+cir1.getArea());
        System.out.println("Circumference of cir1 = "+cir1.getCircumference());

        Circle cir2 = new Circle(3.0,1.0,2.0);
        System.out.println("Area of cir2 = "+cir2.getArea());
        System.out.println("Circumference of cir2 = "+cir2.getCircumference());

        Circle cir3 = new Circle(1.0,3.0,5.0);
        System.out.println("Area of cir3 = "+cir3.getArea());
        System.out.println("Circumference of cir3 = "+cir3.getCircumference());

        Circle cir4 = new Circle(-1.0,-1.0,-10.0);
        System.out.println("Area of cir4 = "+cir4.getArea());
        System.out.println("Circumference of cir4 = "+cir4.getCircumference());

        System.out.println("Does cir1 intersect with cir2: "+Circle.getIntersect(cir1, cir2));
        System.out.println("Does cir1 intersect with cir3: "+Circle.getIntersect(cir1, cir3));
    }
}
