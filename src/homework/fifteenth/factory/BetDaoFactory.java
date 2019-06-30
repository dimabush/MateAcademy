package homework.fifteenth.factory;

import homework.fifteenth.dao.BetDao;
import homework.fifteenth.dao.BetDaoImpl;

public class BetDaoFactory {
  private static BetDao instance;

  public static BetDao getBetDao() {
    if (instance == null) {
      instance = new BetDaoImpl();
    }
    return instance;
  }
}
