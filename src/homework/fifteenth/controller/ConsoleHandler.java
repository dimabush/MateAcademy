package homework.fifteenth.controller;

import homework.fifteenth.dao.BetDao;
import homework.fifteenth.dao.HumanDao;
import homework.fifteenth.lib.Inject;
import homework.fifteenth.model.Bet;
import homework.fifteenth.model.Human;

import java.util.Scanner;

public class ConsoleHandler {

  @Inject
  private static BetDao betDao;

  @Inject
  private static HumanDao humanDao;

  private static Scanner scanner = new Scanner(System.in);

  public static void handleBet() {
    try {
      while (true) {
        String command = scanner.nextLine();
        if (command.equals("0")) {
          return;
        }
        String[] data = command.split(" ");
        int value = Integer.parseInt(data[0]);
        double risk = Double.parseDouble(data[1]);
        Bet bet = new Bet(value, risk);
        betDao.add(bet);
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Invalid data.");
    }
  }

  public static void handleHuman() {
    try {
      while (scanner.hasNext()) {
        String command = scanner.nextLine();
        if (command.equals("0")) {
          return;
        }
        String[] data = command.split(" ");
        String name = data[0];
        int age = Integer.parseInt(data[1]);
        Human human = new Human(name, age);
        humanDao.addHuman(human);
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Invalid data");
    }
  }
}
