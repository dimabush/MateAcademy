package homework.fifteenth;

import homework.fifteenth.controller.ConsoleHandler;
import homework.fifteenth.dao.BetDao;
import homework.fifteenth.dao.BetDaoImpl;
import homework.fifteenth.dao.HumanDao;
import homework.fifteenth.dao.HumanDaoImpl;
import homework.fifteenth.lib.Injector;

public class Main {

  static {
    try {
      Injector.injectDependency();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    System.out.println("In order to make a bet you need to \n"
        + "enter the amount, space and the risk");
    ConsoleHandler.handleBet();
    BetDao betDao = new BetDaoImpl();
    System.out.println(betDao.getAll());

    System.out.println("In order to add a participant you need to \n"
        + "enter the name, space and the age");
    ConsoleHandler.handleHuman();
    HumanDao humanDao = new HumanDaoImpl();
    System.out.println(humanDao.getAllHumans());
  }
}
