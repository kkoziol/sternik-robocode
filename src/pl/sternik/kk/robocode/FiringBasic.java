package pl.sternik.kk.robocode;


public class FiringBasic implements Firing {

    private Rudy102 rudy102;

    public FiringBasic(Rudy102 rudy102) {
        this.rudy102 = rudy102;
    }

    @Override
    public double calculateFirePower(double distance) {
        return 1;
    }

    @Override
    public void fire() {
        rudy102.fire(1);
    }

    
}
