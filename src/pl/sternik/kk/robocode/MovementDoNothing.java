package pl.sternik.kk.robocode;

import robocode.Condition;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;

public class MovementDoNothing implements Movement {

    public MovementDoNothing(Rudy102 robot) {
    }

    @Override
    public void move() {
    }

    @Override
    public void onHitWall(HitWallEvent e) {

    }

    @Override
    public void onHitRobot(HitRobotEvent event) {

    }

    @Override
    public void onHitByBullet(HitByBulletEvent e) {

    }

    @Override
    public void wallAvoidance(Condition condition) {

    }

    @Override
    public void onWin() {
    }

}
