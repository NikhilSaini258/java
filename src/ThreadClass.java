// Threading can be achieved using 2 different ways in Java
// 1. Using Thread abstract class -> It is used when there is no parent class of the current class by extending Thread class
//        In java inheritance -> we can only have one base class
// 2. Using Runnable interface -> This is an interface. A class in Java cam implements multiple interfaces. Runnable internally uses Thread only
//          It is used when we already have parent class of current class.
// Note: No need to define new class for threading. We can "extents" (for Threads) or "implements" (for Runnable) current class also and provide run() method in current class

// We cannot restart the existing completed thread. If we need to restart the same thread, create a new thread object for that
//
//
//

class MyThread extends Thread {
    public void run() {
        for (;;) {
            System.out.println("Thread");
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (;;) {
            System.out.println("Runnable");
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        th1.start();     // call the run() method of MyThread class

        MyRunnable runnable_obj = new MyRunnable();
        Thread th2 = new Thread(runnable_obj);
        th2.start();      // call the run() method of MyRunnable class

        // Main Thread Printing
        for (;;) {
            System.out.println("Main Thread");
        }
    }
}
