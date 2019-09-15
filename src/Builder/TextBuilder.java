package Builder;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("==" + title + "==\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append(str + "\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(i + ". ");
            buffer.append(items[i] + "\n");
        }
    }

    public String getResult() {
        return buffer.toString();
    }
}
