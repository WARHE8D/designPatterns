import creational.asbtract.*;

public class AbstractMain {
    public static void main(String[] args) {
        System.out.println("Running Abstract Pattern code");
        BuildPcImproved(PcByPerformance.HIGH_END_PC);
        BuildPcImproved(PcByPerformance.LOW_END_PC);
    }

    //this method defines cpu and gpu type and its logic is not abstracted
    //now if we need to add a mid range pc build we need to add another if statement and add cpu,gpu values
    private static void BuildPc(PcByPerformance pcByPerformance) {
        if (pcByPerformance == PcByPerformance.HIGH_END_PC) {
            CpuType cpuType = new CpuType(CpuType.cpuType.AMD);
            GpuType gpuType = new GpuType(GpuType.gpuType.AMD);
            Ram ram = new Ram(64);
//            Pc builder = new Pc(cpuType, gpuType, ram);
//            System.out.println("Built Pc: "+builder);
        } else if (pcByPerformance == PcByPerformance.LOW_END_PC) {
            CpuType cpuType = new CpuType(CpuType.cpuType.INTEL);
            GpuType gpuType = new GpuType(GpuType.gpuType.NVIDIA);
            Ram ram = new Ram(16);
//            Pc builder = new Pc(cpuType, gpuType, ram);
//            System.out.println("Built Pc: "+builder);
        } else {
            throw new IllegalArgumentException("Invalid PcByPerformance value");
        }
    }

    //as simple as this; all the logic is encapsulated in the PcBuilderFactory
    //if we wanna add a mid tier pc later all we need to do is create a new static method similar prev methods
    //add create a new keyval in the map n we good to go
    private static void BuildPcImproved(PcByPerformance pcByPerformance) {
        System.out.println(PcBuilderFactory.createPc(pcByPerformance)
                .toString());
    }

}