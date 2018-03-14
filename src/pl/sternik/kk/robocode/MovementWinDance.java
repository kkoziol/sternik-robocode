package pl.sternik.kk.robocode;

import robocode.Condition;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;

public class MovementWinDance implements Movement {

    private Rudy102  me;

    public MovementWinDance(Rudy102 me) {
        this.me = me;
    }

    @Override
    public void move() {
        for (int i = 0; i < 50; i++) {
            me.turnRight(30);
            me.turnLeft(30);
        }
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
