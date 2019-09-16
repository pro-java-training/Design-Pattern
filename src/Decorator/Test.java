package Decorator;

public class Test {
    public static void main(String[] args) {
        Display display1 = new StringDisplay("hello, world");
        Display display2 = new SideBorder(display1, '#');
        Display display3 = new FullBorder(display2);

        display1.show();
        display2.show();
        display3.show();

        Display display4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("hello, world")
                                                ), '*'
                                        )
                                )
                        ), '*'
                );
        display4.show();

        Display display5 = new UpDownBorder(display1, '-');
        display5.show();

        Display display6 = new SideBorder(display5, '*');
        display6.show();

        Display display7 =
                new FullBorder(
                        new UpDownBorder(
                                new SideBorder(
                                        new UpDownBorder(
                                                new SideBorder(
                                                        new StringDisplay("Hello, world"),
                                                        '*'
                                                ),
                                                '='
                                        ),
                                        '|'
                                ),
                                '/'
                        )
                );
        display7.show();

        MultiStringDisplay display8 = new MultiStringDisplay();
        display8.add("hello");
        display8.add("world");
        display8.add("hello, world");
        display8.show();

        Display display9 = new SideBorder(display8, '#');
        display9.show();

        Display display10 = new FullBorder(display8);
        display10.show();
    }
}
