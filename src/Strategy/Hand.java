package Strategy;

public class Hand {
    public static final int VALUE1 = 0;
    public static final int VALUE2 = 1;
    public static final int VALUE3 = 2;

    // 每个 Hand 实例都来自这 3 个单例
    public static final Hand[] hands = {
            new Hand(VALUE1),
            new Hand(VALUE2),
            new Hand(VALUE3),
    };

    private static final String[] names = {"石头", "剪刀", "布"};

    private int value; // 出拳的值

    private Hand(int value) {
        this.value = value;
    }

    public static Hand getHand(int value) {
        return hands[value];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.value + 1) % 3 == hand.value) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return names[value];
    }
}
