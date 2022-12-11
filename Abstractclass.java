abstract class Shape{
    abstract void NumberOfSides();
}


class Rectangle extends Shape{
    void NumberOfSides() {
        System.out.println("4 Sides");
    }
}
class Triangle extends Shape{
    void NumberOfSides() {System.out.println("3 Sides");}
}
class Hexagon extends Shape{
    void NumberOfSides() {
        System.out.println("6 Sides");
    }
}

public class Abstractclass {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.NumberOfSides();
        Triangle t = new Triangle();
        t.NumberOfSides();
        Hexagon h = new Hexagon(); 
        h.NumberOfSides();    
    }
}
