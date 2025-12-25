package creational.builder;

/// builder class for pc components which resolves multiparam constructor problem
public class PCComponentsBuilder {
    // non final are the optional components
    private final String cpu;
    private final String ram;
    private final String storage;
    private String gpu;
    private final String mobo;
    private final String psu;
    private String pwmFans;
    private long minBudget;
    private long maxBudget;

    public PCComponentsBuilder(String cpu, String ram, String storage, String mobo, String psu) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.mobo = mobo;
        this.psu = psu;
    }

    public PCComponentsBuilder gpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public PCComponentsBuilder pwmFans(String pwmFans) {
        this.pwmFans = pwmFans;
        return this;
    }

    public PCComponentsBuilder minBudget(long minBudget) {
        this.minBudget = minBudget;
        return this;
    }

    public PCComponentsBuilder maxBudget(long maxBudget) {
        this.maxBudget = maxBudget;
        return this;
    }

    public PCComponentsBuilder build() {
        return new PCComponentsBuilder(cpu, ram, storage, mobo, psu);
    }
}
