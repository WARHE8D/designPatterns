package creational.asbtract;

public class Ram {
    private long ramSize;

    public long getRamSize() {
        return ramSize;
    }

    public void setRamSize(long ramSize) {
        this.ramSize = ramSize;
    }

    public Ram(long ramSize) {
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "ramSize=" + ramSize +
                '}';
    }
}
