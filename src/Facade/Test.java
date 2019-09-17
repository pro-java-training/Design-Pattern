package Facade;

import Facade.pageMaker.PageMaker;

public class Test {
    public static void main(String[] args) {
        PageMaker.make("apple");
        PageMaker.makeLink("sites.md");
    }
}
