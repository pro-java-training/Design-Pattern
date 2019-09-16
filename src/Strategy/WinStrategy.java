package Strategy;

import java.util.Random;

public class WinStrategy implements Strategy {
    private Random random;

    private boolean win = false; // 上一局是否获胜

    private Hand preHand; // 上一局的手势

    public WinStrategy(long seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!win) {
            preHand = Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }

    @Override
    public void study(boolean win) {
        this.win = win;
    }
}
