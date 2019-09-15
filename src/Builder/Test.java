package Builder;

public class Test {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct(); // 开始构建
        String result = textBuilder.getResult();
        System.out.println(result);
    }
}
