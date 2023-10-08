package code.item01;

public class item01Main {

    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println(settings1);
        System.out.println(settings2);
    }

}
