import creational.builder.PCComponents;
import creational.builder.PCComponentsBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to my design pattern learning journey where i try to learn " +
                "the best practices for OOP!");
        PCComponents pcComponents = new PCComponents("Ryzen 5 5500", "32 GB DDR4", "1 TB",
                "Asus B550", "7600 XT", "N/A", null, 800, 1200);
        addPCComponents(pcComponents);

        //Builder Pattern solution
        PCComponentsBuilder pcComponentsBuilder = new PCComponentsBuilder("Ryzen 5 5500", "32 GB DDR4",
                "2TB SSD", "ASUS B550", "MSI MAG A850")
                .gpu("Sapphire 7600 XT")
                .pwmFans("CORSAIR RS120")
                .minBudget(800)
                .maxBudget(1200)
                .build();
        addPCComponents(pcComponentsBuilder);
    }

    private static void addPCComponents(PCComponents pcComponents) {
        System.out.println("Adding PC components: " + pcComponents.toString());
    }

    private static void addPCComponents(PCComponentsBuilder pcComponentsBuilder) {
        System.out.println("Adding PC components: " + pcComponentsBuilder.toString());
    }
}