package net.mikrowonk.connect_4_noArrays;

public class Field {
    private String sign;
    private final int line;
    private final int column;
    private boolean filled;
    public Field(int line, int column, String sign, boolean filled) {
        this.line = line;
        this.column = column;
        this.sign = sign;
        this.filled = filled;
    }

    public String getSign() {
        return sign;
    }

    public int getLine() {
        return this.line;
    }

    public int getColumn() {
        return column;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean getFilled() {
        return this.filled;
    }
}
