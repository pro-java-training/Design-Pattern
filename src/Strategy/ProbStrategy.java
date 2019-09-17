package Strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {

    private Random random;

    private int preValue = 0;

    private int currentValue = 0;

    // history 是一个统计表, 如 history[0][1] = 3 表示上一次出石头, 这一次出剪刀的获胜次数为 3.
    private int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
    };

    public ProbStrategy(long seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentValue));
        int value = 0;
        if (bet < history[currentValue][0]) {
            value = 0; // 石头
        } else if (bet < history[currentValue][0] + history[currentValue][1]) {
            value= 1; // 剪刀
        } else {
            value = 2; // 布
        }
        preValue = currentValue;
        currentValue = value;
        return Hand.getHand(currentValue);
    }

    // 根据上一次的值, 选择下一次的值
    private int getSum(int historyValue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[historyValue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[preValue][currentValue] ++;
        } else {
            history[preValue][(currentValue + 1) % 3] ++;
            history[preValue][(currentValue + 2) % 3] ++;
        }
    }
}
