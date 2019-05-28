package homework.first;

public class BettingCalculator {
  protected static int matchResult(
          int firstTeamScore, int secondTeamScore, int betFirstTeamScore, int betSecondTeamScore) {
    return (firstTeamScore == betFirstTeamScore && secondTeamScore == betSecondTeamScore) ? 2 :
            (firstTeamScore < secondTeamScore && betFirstTeamScore < betSecondTeamScore)
                    || (firstTeamScore > secondTeamScore && betFirstTeamScore > betSecondTeamScore)
                    || (firstTeamScore == secondTeamScore && betFirstTeamScore
                    == betSecondTeamScore)
                    ? 1 : 0;
  }
}
