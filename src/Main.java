public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(5, 3, 6);
        Square square = new Square(5);
        Pentagon pentagon = new Pentagon(6);

        System.out.println("Circle perimeter: " + " 2 " + "*" + " 3,14 " + "*" + " 6" + " = " + circle.getPerimeter() +
                "\nTriangle perimeter: " + "5 " + "+" + " 3" + " +" + " 6 " + "= " + triangle.getPerimeter() +
                "\nSquare perimeter: " + "4 " + "*" + " 5 " + "= " + square.getPerimeter() +
                "\nPentagon perimeter: " + " 5 " + "*" + " 6 " + "= " + pentagon.getPerimeter());
    }
}