package homework.fifteenth.lib;

import homework.fifteenth.controller.ConsoleHandler;
import homework.fifteenth.dao.BetDaoImpl;
import homework.fifteenth.dao.HumanDaoImpl;
import homework.fifteenth.factory.BetDaoFactory;
import homework.fifteenth.factory.HumanDaoFactory;

import java.lang.reflect.Field;

public class Injector {

  public static void injectDependency() throws IllegalAccessException {
    Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
    Class<BetDaoImpl> betDaoClass = BetDaoImpl.class;
    Class<HumanDaoImpl> humanDaoClass = HumanDaoImpl.class;

    Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
    for (Field field : consoleHandlerFields) {
      if (field.getDeclaredAnnotation(Inject.class) != null) {
        if (field.getGenericType().equals(betDaoClass.getGenericInterfaces()[0])
            && betDaoClass.isAnnotationPresent(Dao.class)) {
          field.setAccessible(true);
          field.set(null, BetDaoFactory.getBetDao());
        } else if (field.getGenericType().equals(humanDaoClass.getGenericInterfaces()[0])
            && humanDaoClass.isAnnotationPresent(Dao.class)) {
          field.setAccessible(true);
          field.set(null, HumanDaoFactory.getHumanDao());
        }
      }
    }
  }
}
