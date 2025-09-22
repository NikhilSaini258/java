package LLD;

public class Singleton {

    private static Singleton instance = null;
    final double PI;

    private Singleton() {
        PI = 3.14;
    }

    static Singleton getInstance () {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

