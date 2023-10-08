package code.item01;

import java.util.Comparator;

public interface HelloService {

    static HelloService of(String lang) {
        if ("eng".equals(lang)) {
            return new EngHelloService();
        }
        return new KorHelloService();
    }

    // 인스턴스를 호출하지 않아도 가능한 Method
    static String hi() {
        prepareMessage();
        return "hi";
    }

    private static void prepareMessage() {
    }

    // 인스턴스를 호출하지 않아도 가능한 Method
    static String hi1() {
        prepareMessage();
        return "hi";
    }

    // 인스턴스를 호출하지 않아도 가능한 Method
    static String hi2() {
        prepareMessage();
        Comparator<Integer> desc = (o1, o2) -> o2 - o1;
        return "hi";
    }

    String sayHello();

    // 인스턴스에서만 호출할 수 있는 Method (정의부 존재)
    default String bye() {
        return "bye";
    }

}
