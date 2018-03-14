package pl.sternik.kk.robocode;

import java.awt.Color;

public class FiringAdvanced implements Firing {

    private Rudy102 rudy102;

    public FiringAdvanced(Rudy102 rudy102) {
        this.rudy102 = rudy102;
    }

    @Override
    public double calculateFirePower(double distance) {
        return 0;
    }

    @Override
    public void fire() {
        rudy102.setBulletColor(Color.GREEN);
        if (Math.abs(rudy102.gunAngleToTurnInDegree) <= 1) {
            if (rudy102.getGunHeat() == 0) {
                rudy102.setFire(Math.min(3 - Math.abs(rudy102.gunAngleToTurnInDegree), rudy102.getEnergy() - .1));
            }
        }

    }

}
