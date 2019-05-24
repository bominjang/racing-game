import dto.RacingGameInfo;
import model.Attendee;
import service.RacingGameService;
import ui.InputView;
import ui.OutputView;

public class GameScenario {

    public void racingGame(){
        RacingGameService racingGameService = new RacingGameService(makeRacingGameInfo());
        racingGameService.startGame();
        OutputView.printResult(racingGameService.getAttendee());
    }

    private RacingGameInfo makeRacingGameInfo(){
        RacingGameInfo racingGameInfo = new RacingGameInfo();
        InputView.askRacingGameInfo(racingGameInfo);
        return racingGameInfo;
    }
}
