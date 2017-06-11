package name.jnsmith.concurrency.synchronization;

public class LongWrapper {

    private final Object key = new Object();
    private long longVal;

    public LongWrapper(long longValue) {
        this.longVal = longValue;
    }

    public long getValue() {
        return longVal;
    }

    public void incrementValue() {

        synchronized (key) {
            longVal = longVal + 1;
        }
    }
}
