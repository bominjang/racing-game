public class Car implements Comparable{
    private String name;
    private int location;
    private final static int CONDITION_NUMBER = 4;

    public Car(String name) {
        this.name = name;
        this.location = 0;
    }

    public void move(int num) {
        if (num >= CONDITION_NUMBER) {
            location++;
        }
    }

    public String getRacingRoad() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < location; i++) {
            stringBuilder.append("=");
        }
        return stringBuilder.toString();
    }

    public String getName() {
        return this.name;
    }

    public int getLocation() {
        return this.location;
    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car) o;
        return car.location - this.location;
    }
}
