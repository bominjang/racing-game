public class Car {
    private int location;
    private final static int CONDITION_NUMBER = 4;

    public Car() {
        location = 0;
    }

    public void move(int num) {
        if (num >= CONDITION_NUMBER) {
            location++;
        }
    }

    public String drawRacingRoad() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < location; i++) {
            stringBuilder.append("=");
        }
        return stringBuilder.toString();
    }
}
