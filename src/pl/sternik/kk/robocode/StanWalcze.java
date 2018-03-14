package pl.sternik.kk.robocode;

public class StanWalcze implements Stan {

    private Rudy102 rudy102;


    public StanWalcze(Rudy102 rudy102) {
        this.rudy102 = rudy102;
    }
    
    
    @Override
    public Stan chooseStrategiesState() {
        switch (rudy102.getOthers()) {
        case 0:
            rudy102.setDebugProperty("State Strategy:", "Wygrana");
            return new StanWygrana(rudy102);
        case 1:
            rudy102.setDebugProperty("State Strategy:", "Walcze");
            return this;
            //jak wiecej przeciwnikow... to to samo
            //potem mozna dodac nastepny zestaw strategii
        default:
            rudy102.setDebugProperty("State Strategy:", "ManyOnOne-ale nie umie");
            return this;
        }
    }

    @Override
    public void updateStrategies() {
        rudy102.movement = new MovementBasic(rudy102);
        rudy102.fireing = new FiringAdvanced(rudy102);
    }

}
