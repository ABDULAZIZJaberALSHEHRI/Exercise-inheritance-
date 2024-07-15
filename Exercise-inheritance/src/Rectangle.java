public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){

    }
    public Rectangle(String color, boolean filled){
        super(color,filled);
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "\nRectangle Color: "+getColor()+
                "\nFilled? "+isFilled()+
                "\nRectangle area = "+getArea()+
                "\nRectangle perimeter = "+getPerimeter()
                +"\n}";
    }
}
