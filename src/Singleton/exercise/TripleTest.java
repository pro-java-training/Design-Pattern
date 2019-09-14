package Singleton.exercise;

public class TripleTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Triple triple = Triple.getInstance((i-1) % 3);
            System.out.println(triple.getId());
        }
    }
}
