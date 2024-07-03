/*
 Java Annotation is a tag that represents the metadata.
 i.e., attached with class, interface, methods or fields to indicate some additional information that can be used by java compiler and JVM.

 Build-in Annotation
    @Override -> Override methods in Derived classes
    @Deprecated -> Give warning during compilation if marked depreciated
    @SuppressWarnings -> This will suppress warning like deprecation. It is used in func signature, before calling the deprecated method.
    @SafeVarargs -> Used in case of generic data type of the private or final method of the class
    @FunctionalInterface -> If an interface has only one method, it is called functional interface

 Build-in Annotation which will affect user defined annotation
    @Retention -> Retention policies determine at which point an annotation is discarded
    @Documented -> To ensure that our custom annotations are shown in the documentation, we use @Documented annotation to annotate our custom annotations.
    @Target -> Define where we can use user defined annotation, like function level, class level, etc
    @Inheritance -> It means child class also get user defined annotation by-default
    @Repeatable -> We can use user defined annotation multiple times
*/

import java.util.List;

class Parent2 {
    void print() {System.out.println("Parent2::print");}
}
class Child2 extends Parent2 {
    @Override
    void print() {System.out.println("Child2::print");}

    @Deprecated
    void show() {System.out.println("Base::show");}
}

class Myclass <T> {
    @SafeVarargs
    private void print (T...args) {
        for (T it: args) {
            System.out.print(it + " ");
        }
    }
}

@FunctionalInterface
interface Myclass2 {
    public void print();
    // public void show();      // It is compulsory for this class to have only a single interface. Otherwise, compiler gives error
}

public class AnnotationClass {
    static List l;

    @SuppressWarnings({"deprecated", "unchecked"})
    public static void main(String[] args) {
        Child2 c_obj = new Child2();
        c_obj.show();

        // below is an unchecked warning. We are directly using reference but didn't create an object for concrete class
        // l.add(10);
    }
}

// create user defined annotation
@interface myAnnotation {
    String name();
    String version() default "9";
    String project();
}
@myAnnotation(name="Nikhil", project = "Web")
class Myclass3 {

}