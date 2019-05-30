package homework.third.robotmoving;

public class Robot {
  public Direction getDirection() {
    return Direction.UP; // the current direction of sight
  }

  public int getX() {
    return 2; // current coordinate X
  }

  public int getY() {
    return 4; // current coordinate Y
  }

  public void turnLeft() {
    System.out.println("Turn left"); // turn 90 degrees counterclockwise
  }

  public void turnRight() {
    System.out.println("Turn right"); // turn 90 degrees clockwise
  }

  public void stepForward() {
    System.out.println("Step forward"); // step in the direction of sight
  }
}
