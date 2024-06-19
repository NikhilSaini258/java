public class OOPs {
    // In Java, all objects are created over HEAP. We cannot create object over STACK

    // For every class in JAVA, a different .class file is created by compiler
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 3;
        System.out.println ("Area of circle is " + c1.calculateArea());
        System.out.println (c1);      // directly printing object which will use toString method of Circle class
    }
    public void HelloWorld() {
        System.out.println("Hello from OOPs class");
    }
}

class Circle {
    public double radius;
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
    public String toString() {
        // This method is called whenever we print class object
        return "[toString]: Area of Circle: " + calculateArea() + " having radius: " + radius;
    }
}

/*
Basic building blocks of OOPs
1. Abstraction
2. Encapsulation
3. Inheritance -> Specialization
4. Polymorphism -> Generalization
    a) Compile Time Polymorphism
    b) Run Time Polymorphism
 */
