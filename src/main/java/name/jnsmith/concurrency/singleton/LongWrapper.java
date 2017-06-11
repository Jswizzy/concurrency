package name.jnsmith.concurrency.singleton;

public class LongWrapper {

    private Object key = new Object();
    private long aLong;

    public LongWrapper(long aLong) {
        this.aLong = aLong;
    }

    public long getValue() {
        synchronized (key) {
            return aLong;
        }
    }

    public void incrementValue() {
        synchronized (key) {
            this.aLong = aLong + 1;
        }
    }
}
