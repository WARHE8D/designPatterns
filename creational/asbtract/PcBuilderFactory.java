package creational.asbtract;

import java.util.HashMap;
import java.util.function.Supplier;

public class PcBuilderFactory {

    private static final HashMap<PcByPerformance, Supplier<Pc>> pcMap = new HashMap<>();

    static {
        pcMap.put(PcByPerformance.HIGH_END_PC, PcBuilderFactory::buildHighEndPc);
        pcMap.put(PcByPerformance.LOW_END_PC, PcBuilderFactory::buildLowEndPc);
    }

    public static Pc createPc(PcByPerformance pcByPerformance) {
        if (pcMap.containsKey(pcByPerformance)) {
            return pcMap.get(pcByPerformance).get();
        }
        throw new IllegalArgumentException("PcByPerformance not found");
    }

    //can create new class for much better abstraction
    //also new CpuType(CpuType.cpuType.AMD) can be created as a new class method that returns getCpuType
    private static Pc buildHighEndPc() {
        CpuType cpu = new CpuType(CpuType.cpuType.AMD);
        Ram ram = new Ram(64);
        GpuType gpu = new GpuType(GpuType.gpuType.AMD);
        //using builder pattern coz y not
        return new Pc.Builder()
                .cpu(cpu)
                .gpu(gpu)
                .ram(ram)
                .build();
    }

    private static Pc buildLowEndPc() {
        CpuType cpu = new CpuType(CpuType.cpuType.INTEL);
        Ram ram = new Ram(16);
        GpuType gpu = new GpuType(GpuType.gpuType.NVIDIA);
        //using builder pattern coz y not
        return new Pc.Builder()
                .cpu(cpu)
                .gpu(gpu)
                .ram(ram)
                .build();
    }
}
