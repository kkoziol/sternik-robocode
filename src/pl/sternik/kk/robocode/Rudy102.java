package pl.sternik.kk.robocode;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Rudy102 extends Robot{
    public void run() {

        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }
    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }
}
