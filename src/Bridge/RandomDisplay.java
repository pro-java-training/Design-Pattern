package Bridge;

import java.util.Random;

// 功能层次, 输出随机次
public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        open();
        times = new Random().nextInt(times);
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
