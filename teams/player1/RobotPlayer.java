package player1;
import battlecode.common.*;

public class RobotPlayer {
  public static void run(RobotController rc) {
    while (true) {
      try {
        if (rc.getType() == RobotType.HQ) {
          if (rc.isCoreReady() && rc.canSpawn(Direction.NORTH, RobotType.BEAVER)) {
            rc.spawn(Direction.NORTH, RobotType.BEAVER);
          }
        } else if (rc.getType() == RobotType.BEAVER) {
          if (rc.isCoreReady() && rc.canMove(Direction.NORTH)) {
            rc.move(Direction.NORTH);
          }
        }
      } catch (GameActionException e) {
        e.printStackTrace();
      }
      rc.yield();
    }
  }
}
