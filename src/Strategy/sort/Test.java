package Strategy.sort;

public class Test {

    public static void main(String[] args) {
        String[] data = {
                "darwin", "Boston", "Cathy", "Edward", "Alice"
        };
//        SorterAndPrint sap = new SorterAndPrint(data, new SelectionSorter());
//        sap.execute();

        SorterAndPrint sap2 = new SorterAndPrint(data, new BinarySorter());
        sap2.execute();
    }
}
