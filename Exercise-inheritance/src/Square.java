public class Square extends Rectangle{

    public Square(){

    }
    public Square(double side){
        side=getLength();
    }
    public Square(double side, String color, boolean filled){
        super(color,filled);
        setWidth(side);
        setLength(side);
    }

    public void setSide(double side){

    }

    public double getSide(){
        return getLength()*getWidth();
    }

    @Override
    public String toString() {
        return "Square {" +
                "\nSquare Color: "+getColor()+
                "\nFilled? "+isFilled()+
                "\nSquare side = "+getSide()
                +"\n}";    }
}
