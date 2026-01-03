package behavioral.template;

public class TemplateMain {
    public static void main(String[] args) {

        IsekaiSlime slime = new IsekaiSlime();
        slime.startStory();

        System.out.println("--------------------");
        Kagejitsu kagejitsu = new Kagejitsu();
        kagejitsu.startStory();


        System.out.println("--------------------");
        IsekaiNonbiriNouka inn = new IsekaiNonbiriNouka();
        inn.startStory();


    }
}
