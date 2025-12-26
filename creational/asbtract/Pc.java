package creational.asbtract;

public class Pc {
    private CpuType cpuType;
    private GpuType gpuType;
    private Ram ram;

    public Pc(CpuType cpuType, GpuType gpuType, Ram ram) {
        this.cpuType = cpuType;
        this.gpuType = gpuType;
        this.ram = ram;
    }

    //builder pattern
    public Pc gpu(GpuType gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    public Pc ram(Ram ram) {
        this.ram = ram;
        return this;
    }

    public Pc cpu(CpuType cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    // Static inner Builder class
    public static class Builder {
        private CpuType cpuType;
        private GpuType gpuType;
        private Ram ram;

        public Builder cpu(CpuType cpuType) {
            this.cpuType = cpuType;
            return this;
        }

        public Builder gpu(GpuType gpuType) {
            this.gpuType = gpuType;
            return this;
        }

        public Builder ram(Ram ram) {
            this.ram = ram;
            return this;
        }

        public Pc build() {
            return new Pc(cpuType, gpuType, ram);
        }
    }

    @Override
    public String toString() {
        return "Pc{" +
                "cpuType=" + cpuType +
                ", gpuType=" + gpuType +
                ", ram=" + ram +
                '}';
    }
}
