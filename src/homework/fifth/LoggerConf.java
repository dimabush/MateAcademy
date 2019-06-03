package homework.fifth;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LoggerConf {
  private static void configureLogging() {
    Logger loggerClassA = Logger.getLogger("org.stepic.java.logging.ClassA");
    loggerClassA.setLevel(Level.ALL);

    Logger loggerClassB = Logger.getLogger("org.stepic.java.logging.ClassB");
    loggerClassB.setLevel(Level.WARNING);

    Logger logger = Logger.getLogger("org.stepic.java");
    logger.setLevel(Level.ALL);

    ConsoleHandler consoleHandler = new ConsoleHandler();
    XMLFormatter xmlFormatter = new XMLFormatter();
    consoleHandler.setFormatter(xmlFormatter);
    consoleHandler.setLevel(Level.ALL);

    logger.addHandler(consoleHandler);
    logger.setUseParentHandlers(false);
  }
}
