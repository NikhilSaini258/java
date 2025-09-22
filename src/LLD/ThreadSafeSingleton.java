package LLD;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance = null;
    final double PI;

    private ThreadSafeSingleton() {
        PI = 3.14;
    }

    static ThreadSafeSingleton getInstance() {
        if (instance == null) {                                // 1️⃣ First check (no locking)
            synchronized (ThreadSafeSingleton.class) {         // 2️⃣ Acquire lock only if null
                if (instance == null) {                        // 3️⃣ Second check inside lock
                    instance = new ThreadSafeSingleton();      // 4️⃣ Create object
                }
            }
        }
        return instance;
    }
}
