import dto.RacingGameInfo;
import service.RacingGameService;
import ui.InputView;
import ui.OutputView;

public class GameScenario {

    public void racingGame(){
        RacingGameService racingGameService = new RacingGameService(makeRacingGameInfo());
        racingGameService.startGame();
        OutputView.printTrack(racingGameService.getRacingGameAttendeeGroup());
        OutputView.printWinner(racingGameService.getRacingGameAttendeeGroup());
    }

    private RacingGameInfo makeRacingGameInfo(){
        return InputView.askRacingGameInfo();
    }
}
