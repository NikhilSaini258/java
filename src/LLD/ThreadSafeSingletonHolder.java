package LLD;

public class ThreadSafeSingletonHolder {
    final double PI;

    private ThreadSafeSingletonHolder () {
        PI = 3.14;
    }

    // static inner class holds the Singleton instance
    private static class Holder {
        private static final ThreadSafeSingletonHolder INSTANCE = new ThreadSafeSingletonHolder();
    }

    public static ThreadSafeSingletonHolder getInstance() {
        return Holder.INSTANCE;
    }
}
