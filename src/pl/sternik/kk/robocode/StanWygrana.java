package pl.sternik.kk.robocode;

public class StanWygrana implements Stan {

    private Rudy102 rudy102;

    public StanWygrana(Rudy102 rudy102) {
        this.rudy102 = rudy102;
    }

    @Override
    public Stan chooseStrategiesState() {
        //stan koncowy nic juz sienie zmieni
        return this;
    }

    @Override
    public void updateStrategies() {
        rudy102.movement = new MovementWinDance(rudy102);
        rudy102.fireing = new FiringDoNothing(rudy102);
    }

}
