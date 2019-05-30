package homework.third.robotmoving;

public class RobotMoving {
  public static void moveRobot(Robot robot, int toX, int toY) {
    while (robot.getX() < toX) {
      while (robot.getDirection() != Direction.RIGHT){
        robot.turnRight();
      }
      robot.stepForward();
    }
    while (robot.getX() > toX) {
      while (robot.getDirection() != Direction.LEFT){
        robot.turnLeft();
      }
      robot.stepForward();
    }
    while (robot.getY() < toY) {
      while (robot.getDirection() != Direction.UP){
        robot.turnLeft();
      }
      robot.stepForward();
    }
    while (robot.getY() > toY) {
      while (robot.getDirection() != Direction.DOWN){
        robot.turnRight();
      }
      robot.stepForward();
    }
    System.out.println("Robot on position: (" + robot.getX() + ", " + robot.getY() + ").");
  }
}
