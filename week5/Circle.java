public class Circle {
    private double radius = 1;
    private double x = 0.0;
    private double y = 0.0;

    public Circle(){}
    //User inputs radius/point x/point y.
    public Circle(double newRadius,double x, double y){
        radius = newRadius;
        this.x = x;
        this.y = y;
    }
    //Gets area from radius.
    public double getArea(){
        if(radius<0){
            return 0.0;
        }
        else{
            return radius * radius *Math.PI;
        }  
    }
    //Gets circumference from radius.
    public double getCircumference(){
        if(radius<0){
            return 0.0;
        }
        else{
            return 2 * Math.PI * radius;
        }     
    }
    //Method to calculate the intersection of 2 circles by using 2 declared Circle class objects.
    //Returns as true/false.
    public static boolean getIntersect(Circle cir1, Circle cir2){
        double distSQ = 0;
        distSQ = (cir1.x-cir2.x) * (cir1.x-cir2.x) + (cir1.y-cir2.y) * (cir1.y-cir2.y);

        double radSumSQ = 0;
        radSumSQ = (cir1.radius+cir2.radius) * (cir1.radius+cir2.radius);

        if(distSQ>radSumSQ){
            return false;
        }
        else{
            return true;
        }
    }
}
