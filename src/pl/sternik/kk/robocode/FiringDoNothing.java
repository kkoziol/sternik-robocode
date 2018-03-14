package pl.sternik.kk.robocode;

public class FiringDoNothing implements Firing {

    private Rudy102 rudy102;

    public FiringDoNothing(Rudy102 rudy102) {
        this.rudy102 = rudy102;
    }

    @Override
    public double calculateFirePower(double distance) {
        return 0;
    }

    @Override
    public void fire() {
    }

    
}
