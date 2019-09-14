package Singleton.exercise;

public class Triple {
    private static Triple[] triples = new Triple[] {
            new Triple(1),
            new Triple(2),
            new Triple(3)
    };

    private int id;

    private Triple(int id) {
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triples[id];
    }

    public int getId() {
        return id;
    }
}
