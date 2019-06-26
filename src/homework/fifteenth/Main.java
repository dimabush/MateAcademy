package homework.fifteenth;

import homework.fifteenth.controller.ConsoleHandler;
import homework.fifteenth.dao.BetDao;
import homework.fifteenth.dao.BetDaoImpl;
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
    System.out.println("In order to make a bet you need to \n" +
        "enter the amount, space and the risk");
    ConsoleHandler.handle();
    BetDao betDao = new BetDaoImpl();
    System.out.println(betDao.getAll());
 }
}
