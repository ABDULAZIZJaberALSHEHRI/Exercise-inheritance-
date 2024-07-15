//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("=================================\n" +
                "============= Shape =============");
        Shape shape1 = new Shape("blue",true);
        System.out.println(shape1.toString());

        //Circle-----------------------------------------
        System.out.println("\n=================================\n" +
                "============ Circle =============");
        Circle circle1= new Circle(1,"White",true);
        System.out.println(circle1.toString());

        //Rectangle-----------------------------------------
        System.out.println("\n=================================\n" +
                "=========== Rectangle ===========");
        Rectangle rectangle1 = new Rectangle(2,3,"Yellow",true);
        System.out.println(rectangle1.toString());

        //Square -----------------------------------------
        System.out.println("\n=================================\n" +
                "============= Square ============");
        Square square1 = new Square(10,"RED",true);
        System.out.println(square1.toString());


    }
}