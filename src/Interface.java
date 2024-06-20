// Interface -> Similar to Abstract classes -> When all methods of any class are abstract, it works like Interface
// Interfaces are "implemented" in derived classes, while abstract classes are "extends"
// We can have multiple interfaces implemented in a single class, not like inheritance where can only inherit from 1 base class

// In interface, all methods are "public" & "abstract" by-default. We can also have "static" methods in the interface.
// In interface, all variables are "final" & "static" by-default
// Interfaces can be "extended" to other interfaces.
// Interfaces can also have "default" type methods, which can be accessed by concrete class object
// We can also have "private" methods in interfaces, which are used by "default" methods (After java 9)
//

/*
Below, both codes are correct & working.
test1 (abstract class) & test2 (interface) are similar

abstract class test1 {
    abstract void test1();
    abstract void test2();
}

class MyTest1 extends test {
    void test1() {}
    void test2() {}
}

interface test2 {
    void test1();
    void test2();
}

class MyTest2 implements test2 {
    public void test1() {}
    public void test2() {}
}

test1 obj1 = new MyTest1();
test2 obj2 = new MyTest2();
*/

// below example shows abstract classes and interfaces use in same class

class Phone {
    public void call() { System.out.println("Phone::call()");}
    public void sms() { System.out.println("Phone::sms()"); }
}

interface ICamera {
    void click();
    void record();
}

interface IMusicPlayer {
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    // Method specific to SmartPhone
    public void videoCall() {System.out.println("SmartPhone::videoCall()");}

    // Method form ICamera
    public void click() {System.out.println("SmartPhone::click()");}
    public void record() {System.out.println("SmartPhone::record()");}

    // Methods from IMusicPlayer
    public void play() {System.out.println("SmartPhone::play()");}
    public void stop() {System.out.println("SmartPhone::stop()");}

    // Methods from Phone class are directly accessible
}

public class Interface {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.videoCall();

        Phone ph = sp;
        sp.call();

        ICamera ic = sp;
        ic.click();

        IMusicPlayer mp = sp;
        mp.play();
    }
}
