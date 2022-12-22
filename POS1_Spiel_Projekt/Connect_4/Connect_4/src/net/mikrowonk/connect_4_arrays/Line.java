package net.mikrowonk.connect_4_arrays;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private String sign;
    private int columns;
    protected List<Column> lineColumns;

    public Line(String sign, int columns) {
        this.sign = sign;
        this.columns = columns;
        this.lineColumns = new ArrayList<>(columns);
        for (int i = 0; i < columns; i++) {
            lineColumns.add(new Column(sign));
        }
    }

    public void showLine() {
        for (Column column : lineColumns) {
            System.out.print(column.getSign() + " ");
        }
        System.out.println();
    }

    public void setColumn(int columnIndex, String sign) {
        this.lineColumns.get(columnIndex).setSign(sign);
    }

    public List<Column> getLineColumns() {
        return lineColumns;
    }

    public void setLineColumns(List<Column> lineColumns) {
        this.lineColumns = lineColumns;
    }
}