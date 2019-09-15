package Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("笔记");
        builder.makeString("2019-9-14");
        builder.makeItems(new String[]{
                "复习设计模式",
                "学习 C++"
        });
    }
}
