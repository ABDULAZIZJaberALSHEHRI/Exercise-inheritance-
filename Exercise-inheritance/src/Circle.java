public class Circle extends Shape{

    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getperimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "\nCircle Color: "+getColor()+
                "\nFilled? "+isFilled()+
                "\nradius = " + radius +
                "\nCircle area = "+getArea()+
                "\nCircle perimeter = "+getperimeter()
                +"\n}";
    }
}
