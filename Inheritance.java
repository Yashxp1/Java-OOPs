package OOPs;

//Create a Shape class with a method area().
//Create a Rectangle class that inherits from Shape.
//Rectangle should have width and height and override the area() method to calculate the area.
//Create a Cube class that inherits from Rectangle and overrides area() to calculate the surface area of a cube.


class Shape{

    void area() {
        System.out.println("Calculate area");
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Area of rectangle is:" + length * breadth);
    }
}

class Cube extends Rectangle {
    int side;

    Cube(int side) {
        super(side, side);
        this.side = side;
    }

    void area() {
        System.out.println("Surface area of cube is:" + 6 * side * side);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(4,6);
        rec.area();

        Cube cube = new Cube(3);
        cube.area();
    }
}
