import model.RacingGameInfo;
import service.RacingGameService;
import ui.InputView;

public class GameScenario {

    private final static int MOVE_CONDITION =4;//전진조건 설정

    public void racingGame(){
        RacingGameService racingGameService = new RacingGameService(makeRacingGameInfo());
        racingGameService.startGame();
        racingGameService.printResult();
    }

    public RacingGameInfo makeRacingGameInfo(){
        InputView inputView = new InputView();
        int numberOfCars = inputView.askNumberOfCars();
        int countOfAttempt = inputView.askCountOfAttempt();
        return new RacingGameInfo(MOVE_CONDITION , countOfAttempt, numberOfCars);
    }
}
