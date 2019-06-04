package homework.fifth.robot;

public class Robot {
  public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
    RobotConnection robotConnection = null;
    for (int i = 0; i < 3; i++) {
      try {
        robotConnection = robotConnectionManager.getConnection();
        robotConnection.moveRobotTo(toX, toY);
        break;
      } catch (RobotConnectionException e1) {
        if (i == 2) {
          throw new RobotConnectionException("We have some problem.", e1);
        }
      } finally {
        try {
          robotConnection.close();
        } catch (Exception e){
          System.out.println(e);
        }
      }
    }
  }
}
