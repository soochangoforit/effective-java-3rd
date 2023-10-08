package code.item01;

public class HelloServiceFactory {

    public static HelloService of(String lang) {
        if ("eng".equals(lang)) {
            return new EngHelloService();
        }
        return new KorHelloService();
    }

}
