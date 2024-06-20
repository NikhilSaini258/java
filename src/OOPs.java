public class OOPs {
    // In Java, all objects are created over HEAP. We cannot create object over STACK

    // For every class in JAVA, a different .class file is created by compiler
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.setRadius(3);
        System.out.println ("Area of circle is " + c1.calculateArea());
        System.out.println (c1);      // directly printing object which will use toString method of Circle class

        // Array of objects
        Circle[] circleArr = new Circle[3];
        circleArr[0] = new Circle(1);
        circleArr[1] = new Circle(2);
        circleArr[2] = new Circle(3);

        for (Circle c: circleArr) {
            System.out.println(c);
        }
    }
    public void HelloWorld() {
        System.out.println("Hello from OOPs class");
    }
}

class Circle {
    private double radius;
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
    public String toString() {
        // This method is called whenever we print class object
        return "[toString]: Area of Circle: " + calculateArea() + " having radius: " + radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Constructor: can be parametrized or non-parametrized. We can have multiple constructors for a class.
    // Every class have default constructor. If we declare our own constructor, then default constructor is deleted
    // Java doesn't have Destructor as we have in c++
    public Circle(int radius) {
        // "this" will represent the current object
        this.radius = radius;
    }
}

/*
Basic building blocks of OOPs
1. Abstraction
2. Encapsulation
3. Inheritance
4. Polymorphism
    a) Compile Time Polymorphism
    b) Run Time Polymorphism

Generalization -> Like base class, is more generic form of any other classes. It is bottom-up.
                This is achieved using Interfaces.
Specialization -> Like Derived class, specialized for any class. It is top-down.
                This is achieved using Inheritance.
 */
