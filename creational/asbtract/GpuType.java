package creational.asbtract;

public class GpuType {
    public enum gpuType {
        AMD, NVIDIA;
    }

    private gpuType gpuType;

    public gpuType getGpuType() {
        return gpuType;
    }

    public void setGpuType(gpuType gpuType) {
        this.gpuType = gpuType;
    }

    public GpuType(gpuType gpuType) {
        this.gpuType = gpuType;
    }

    @Override
    public String toString() {
        return "GpuType{" +
                "gpuType=" + gpuType +
                '}';
    }
}
