// Threading can be achieved using 2 different ways in Java
// 1. Using Thread abstract class -> It is used when there is no parent class of the current class by extending Thread class
//        In java inheritance -> we can only have one base class
// 2. Using Runnable interface -> This is an interface. A class in Java cam implements multiple interfaces. Runnable internally uses Thread only
//          It is used when we already have parent class of current class.
// Note: No need to define new class for threading. We can "extents" (for Threads) or "implements" (for Runnable) current class also and provide run() method in current class

// We cannot restart the existing completed thread. If we need to restart the same thread, create a new thread object for that

// Threads can have priority in range [0,10], where 10 have the highest priority and 0 have the lowest priority.
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

public class ThreadClass extends Thread {
    public void run() {
        System.out.println("Thread from ThreadClass");
    }
    public static void main(String[] args) {
        /*
        MyThread th1 = new MyThread();
        th1.start();     // call the run() method of MyThread class
         */

        /*
        MyRunnable runnable_obj = new MyRunnable();
        Thread th2 = new Thread(runnable_obj);
        th2.start();      // call the run() method of MyRunnable class
         */

        // Main Thread Printing
        // for (;;) {
        //    System.out.println("Main Thread");
        // }

        ThreadClass tc_obj1 = new ThreadClass();
        System.out.println("threadId: " + tc_obj1.threadId());
        System.out.println("getId: " + tc_obj1.getId());
        System.out.println("getState: " + tc_obj1.getState());
        System.out.println("getThreadGroup: " + tc_obj1.getThreadGroup());
        System.out.println("isAlive: " + tc_obj1.isAlive());
        System.out.println("isInterrupted: " + tc_obj1.isInterrupted());

        // getPriority & setPriority
        System.out.println("Default Thread priority: " + tc_obj1.getPriority());
        tc_obj1.setPriority(6);
        System.out.println("Updated Thread priority: " + tc_obj1.getPriority());

        // getName & setName
        System.out.println("default getName: " + tc_obj1.getName());
        tc_obj1.setName("my thread");
        System.out.println("updated getName: " + tc_obj1.getName());

        // daemon thread has the least priority & running in the background. E.g., Garbage collector
        System.out.println("default isDaemon: " + tc_obj1.isDaemon());
        tc_obj1.setDaemon(true);
        System.out.println("after isDaemon: " + tc_obj1.isDaemon());

        /*
        Cnstructors:
            Thread()
            Thread (Runnable r)
            Thread (Runnable r, String thread_name)
            Thread (ThreadGroup tg, String thread_name)
         */

        /*
        Instance method of thread class
            void interrupt() -> It will interrupt the current state of thread
            void join() -> We can wait in the main thread till the current thread is over.
            void join (long milliseconds) -> Join after milliseconds
            void run() -> we should override this method
            void start() -> This have multithreaded code which will call run() in different thread.
         */

        /*
        Static Methods
            int activeCount() ->
            Thread currentThread() ->
            void yield() ->
            void dumpStack() ->
         */


    }
}
