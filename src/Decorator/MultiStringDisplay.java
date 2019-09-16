package Decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {

    private List<String> list = new ArrayList<>();

    private int columns = 0;

    public void add(String string) {
        list.add(string);
        setCols();
    }

    private void setCols() {
        for (String str : list) {
            int tmp = str.getBytes().length;
            if (columns < tmp) {
                columns = tmp;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            String tmp = list.get(i);
            int blankCount = columns - tmp.getBytes().length;
            if (blankCount > 0) {
                list.set(i, tmp + appendBlank(' ', blankCount));
            }
        }
    }

    private String appendBlank(char ch, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(ch);
        }
        return builder.toString();
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return list.size();
    }

    @Override
    public String getRowText(int row) {
        return list.get(row);
    }
}
