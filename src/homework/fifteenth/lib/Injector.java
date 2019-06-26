package homework.fifteenth.lib;

import homework.fifteenth.controller.ConsoleHandler;
import homework.fifteenth.dao.BetDaoImpl;
import homework.fifteenth.factory.BetDaoFactory;

import java.lang.reflect.Field;

public class Injector {

  public static void injectDependency() throws IllegalAccessException {
    Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
    Class<BetDaoImpl> betDaoClass = BetDaoImpl.class;

    Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
    for (Field field : consoleHandlerFields) {
      if (field.getDeclaredAnnotation(Inject.class) != null) {
        if (field.getGenericType().equals(betDaoClass.getGenericInterfaces()[0])) {
          field.setAccessible(true);
          field.set(null, BetDaoFactory.getBetDao());
        }
      }
    }
  }
}
