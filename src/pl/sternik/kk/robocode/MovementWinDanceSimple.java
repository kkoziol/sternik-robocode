package pl.sternik.kk.robocode;

import pl.sternik.kk.robocode.Movement;
import pl.sternik.kk.robocode.Rudy102;
import robocode.Condition;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;

public class MovementWinDanceSimple implements Movement {

    private Rudy102 me;

    public MovementWinDanceSimple(Rudy102 me) {
        this.me = me;
    }

    @Override
    public void move() {
        // Victory dance
        me.turnRight(36000);
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
