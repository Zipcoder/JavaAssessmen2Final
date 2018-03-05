package part1;

public class WuTangConcatenator {
    Integer input;
    boolean isWuTang;
    boolean isTang;
    boolean isWu;


    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public boolean isWu() {
        return input % 3 == 0;
    }

    public boolean isTang() {
        return input % 5 == 0;
    }

    public boolean isWuTang() {
        return input % 3 == 0 && input % 5 == 0;
    }
}
