package pl.sternik.kk.robocode;

import robocode.Condition;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;

public interface Movement {

    void move();

    void onHitWall(HitWallEvent e);

    void onHitRobot(HitRobotEvent event);

    void onHitByBullet(HitByBulletEvent e);

    void wallAvoidance(Condition condition);

    void onWin();
}
