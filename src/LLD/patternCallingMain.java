package LLD;

public class patternCallingMain {
    public static void main(String[] args) {
        // Compilation error since Singleton constructor is private
        // Singleton obj = new Singleton();

        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.PI);

        Singleton obj2 = Singleton.getInstance();

        // return true since both obj1 and obj2 are same
        // a single object is created for both
        System.out.println(obj1 == obj2);
    }
}
