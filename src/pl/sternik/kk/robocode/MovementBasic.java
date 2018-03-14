package pl.sternik.kk.robocode;

import pl.sternik.kk.robocode.Movement;
import pl.sternik.kk.robocode.Rudy102;
import robocode.Condition;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;

public class MovementBasic implements Movement {

    private Rudy102 rudy102;

    public MovementBasic(Rudy102 robot) {
        this.rudy102 = robot;
    }

    @Override
    public void move() {
        // ustaw sie prostopadle jezeli mamy cel
        if (rudy102.currentEnemy != null)
            rudy102.setTurnLeft(90 - rudy102.currentEnemy.getBearing());

        if (rudy102.getDistanceRemaining() == 0) {
            rudy102.setAhead(100 * rudy102.kierunek);
            rudy102.kierunek *= -1;
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
