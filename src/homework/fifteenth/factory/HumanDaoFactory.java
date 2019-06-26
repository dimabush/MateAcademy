package homework.fifteenth.factory;

import homework.fifteenth.dao.HumanDao;
import homework.fifteenth.dao.HumanDaoImpl;

public class HumanDaoFactory {
  private static HumanDao instance;

  public static HumanDao getHumanDao() {
    if (instance == null) {
      instance = new HumanDaoImpl();
    }
    return instance;
  }
}
