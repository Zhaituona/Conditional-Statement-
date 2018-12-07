package useOfEnum;

public enum Level {

    high(1),
    low(3),
    medium(2);

    private int value;

    private Level(int c) {
        this.value = c;
    }

    public int getValue() {
        return value;
    }




}
