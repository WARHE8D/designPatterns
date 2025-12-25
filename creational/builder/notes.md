Problem Statement:
imagine having a lot of parameters in the constructor of a class.
And we dont know what values are going to set in it if they have same datatype;
for example, consider the following constructor:

    public PCBuilder(String cpu, String ram, String storage, String gpu, String mobo, String psu, String heatSink, 
                        long minBudget, long maxBudget) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.mobo = mobo;
        this.psu = psu;
        this.heatSink = heatSink;
        this.minBudget = minBudget;
        this.maxBudget = maxBudget;
    }

and when you create an object you will not know which argument is mapped to which parameter,
as the constructor relies entirely on the parameter order
PCBuilder pcComponents = new PCBuilder("Ryzen 5 5500","32 GB DDR4", "1 TB",
"Asus B550","7600 XT","N/A",null,800,1200);

As a result, incorrect assignments can easily occur (for example, passing a motherboard value where a GPU is expected),
leading to bugs that are hard to detect and maintain.

Solution: Builder Pattern makes it much easier to add arguments for the Object

        PCComponentsBuilder pcComponentsBuilder = new PCComponentsBuilder("Ryzen 5 5500", "32 GB DDR4",
        "2TB SSD", "ASUS B550", "MSI MAG A850")
        .gpu("Sapphire 7600 XT")
        .pwmFans("CORSAIR RS120")
        .minBudget(800)
        .maxBudget(1200)
        .build();