// Object class is the parent class of all classes in Java (including user defined classes)

class MyClass_object {

}

class MyClass_object_2 {
    public String toString() { return "MyClass_object_2::toString"; }
    public int hashCode() { return 100; }
    public boolean isEqual (Object o) {
        // I'm making equals check the hashcode of the object
        return this.hashCode() == o.hashCode();
    }
    // Cannot override below 2 methods since they are "final" in the Object class and it is internally used by JVM for multithreading
    // public void notify() {}
    // public void wait() {}
}

public class LangPackageClass {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.hashCode());
        System.out.println(o.toString());

        Object o2 = new Object();
        System.out.println(o.equals(o2));       // false, since it is actually check whether o and o2 are the same object or different

        MyClass_object o3 = new MyClass_object();
        System.out.println(o3.hashCode());
        System.out.println(o3.toString());
    }
}
