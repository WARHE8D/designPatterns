package creational.builder;

public class PCComponents {
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String gpu;
    private final String mobo;
    private final String psu;
    private final String pwmFans;
    private final long minBudget;
    private final long maxBudget;

    public PCComponents(String cpu, String ram, String storage, String gpu, String mobo, String psu, String pwmFans, long minBudget, long maxBudget) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.mobo = mobo;
        this.psu = psu;
        this.pwmFans = pwmFans;
        this.minBudget = minBudget;
        this.maxBudget = maxBudget;
    }

    @Override
    public String toString() {
        return "PCComponents{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", gpu='" + gpu + '\'' +
                ", mobo='" + mobo + '\'' +
                ", psu='" + psu + '\'' +
                ", pwmFans='" + pwmFans + '\'' +
                ", minBudget=" + minBudget +
                ", maxBudget=" + maxBudget +
                '}';
    }
}
