package code.item01;

public interface HelloService {

    static HelloService of(String lang) {
        if ("eng".equals(lang)) {
            return new EngHelloService();
        }
        return new KorHelloService();
    }

    String sayHello();

}
