package creational.asbtract;

public class CpuType {
    public enum cpuType {
        AMD, INTEL;
    }

    private cpuType cpuType;

    public CpuType(cpuType cpuType) {
        this.cpuType = cpuType;
    }

    public cpuType getCpuType() {
        return cpuType;
    }

    public void setCpuType(cpuType cpuType) {
        this.cpuType = cpuType;
    }

    @Override
    public String toString() {
        return "CpuType{" +
                "cpuType=" + cpuType +
                '}';
    }
}
