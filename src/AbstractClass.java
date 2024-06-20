// Abstract classes
// Reference can be created, but no concrete object
// Abstract classes can have zero or more abstract methods.
// If any one abstract method is present in class, then we need to have abstract class.

abstract class Base2 {
    public Base2 () {
        System.out.println("Base2::Base2");
    }
    public void method1 () {
        System.out.println("Base2::method1");
    }
    abstract void method2();
}

// If we don't override all abstract methods of base class in derived class, then derived class also become abstract
class Derived2 extends Base2 {
    public Derived2() {
        System.out.println("Derived2::Derived2");
    }
    @Override
    void method2() {
        System.out.println("Derived2:method2");
    }
}

public class AbstractClass {
    public static void main (String[] args) {
//        Base2 obj = new Base2();          // compilation error
        Base2 obj1 = new Derived2();
        obj1.method1();
        obj1.method2();
    }
}
