import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names = sc.nextLine();
        int tryTimes = sc.nextInt();

        StringTokenizer st = new StringTokenizer(names, ",");
        RacingGame game = new RacingGame();
        List<Car> cars = new ArrayList<>();
        while(st.hasMoreTokens()) {
            cars.add(new Car(st.nextToken()));
        }
        game.race(tryTimes, cars);

        for(Car car: cars){
            System.out.print(car.getName() + " : ");
            System.out.println(car.getRacingRoad());
        }

        List<Car> winners = game.getWinner(cars);
        for(Car car: winners){
            System.out.print(car.getName()+" ");
        }
        System.out.print("가 최종우승했습니다.");
    }
}
