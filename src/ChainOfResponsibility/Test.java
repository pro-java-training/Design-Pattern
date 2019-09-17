package ChainOfResponsibility;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Support limit = new LimitSupport("limit", 10);
        Support odd = new OddSupport("odd");
        Support special = new SpecialSupport("special", 20);
        Support odd2 = new OddSupport("odd2");

        // 设置责任链
        limit.setNext(limit).setNext(odd).setNext(special).setNext(odd2);

        Random random = new Random();
        for (int i = 0; i < 500; i += random.nextInt(10)) {
            limit.support(new Trouble(i)); // 处理问题
        }
    }
}
