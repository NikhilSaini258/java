// Inner classes can be implemented using four different ways:
// 1. Inner class as class member
// 2. Inner class inside method
// 3. Anonymous inner class
// 4. Static Inner class

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 20;
        void innerDisplay() {
            // Inner class can access all elements of outer class
            System.out.println("InnerClass::innerDisplay::x = " + x);
            System.out.println("InnerClass::innerDisplay::y = " + y);
        }
    }
    public void outerDisplay() {
        InnerClass iobj = new InnerClass();
        iobj.innerDisplay();
        System.out.println("OuterClass::outerDisplay::y = " + iobj.y);
    }
}

// Inner classes can also be defined inside methods
class OuterClass2 {
    public void display() {
        class InnerClass2 {
            void innerDisplay() {System.out.println("InnerClass2::innerDisplay");}
        }

        InnerClass2 i_obj = new InnerClass2();
        i_obj.innerDisplay();
    }
}

// Anonymous Inner class
// can be implemented using abstract classes or interfaces
abstract class MyClass {
    abstract void display();
}
class OuterClass3 {
    public void display() {
        MyClass obj = new MyClass() {
            @Override
            void display() {
                System.out.println("Hello from Inner class");
            }
        };

        obj.display();
    }
}

// Static Inner class
class OuterClass4 {
    static int a = 20;
    int b = 100;
    static class InnerClass4 {
        void display() {
            System.out.println(a);      // can access static members inside static inner class
            // System.out.println(b);   // ERROR: cannot access non-static members inside static inner class
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        // creating an object of outer class
        OuterClass o_obj = new OuterClass();
        o_obj.outerDisplay();

        // creating an object of inner class
        OuterClass.InnerClass i_obj = new OuterClass().new InnerClass();
        i_obj.innerDisplay();


        // creating an object of static inner class
        OuterClass4.InnerClass4 oi4 = new OuterClass4.InnerClass4();
        oi4.display();
    }
}
