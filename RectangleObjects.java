class Rectangle{
    double length,breadth;
    public void setDimension (double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea() {
        return length * breadth;
    }
    public double computePerimeter() {
        return 2 * (length + breadth);
    }
}

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.setDimension(10, 20);
        System.out.println("Area: " + R1.getArea());
        System.out.println("Perimeter: " + R1.computePerimeter());
    }
}
