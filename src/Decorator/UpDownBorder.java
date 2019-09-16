package Decorator;

public class UpDownBorder extends Border {

    private char border;

    public UpDownBorder(Display display, char border) {
        super(display);
        this.border = border;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return makeLine(border, display.getColumns());
        } else {
            return display.getRowText(row - 1);
        }
    }

    private String makeLine(char ch, int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(ch);
        }
        return buffer.toString();
    }
}
