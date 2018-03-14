package pl.sternik.kk.robocode;

public class StanInitial implements Stan {

    private Rudy102 me;

    public StanInitial(Rudy102 rudy102) {
        this.me = rudy102;
    }

    @Override
    public Stan chooseStrategiesState() {
        switch (me.getOthers()) {
        case 0:
            me.setDebugProperty("State Strategy:", "Initial");
            return this;
        case 1:
            me.setDebugProperty("State Strategy:", "OneOnOne-walcze");
            return new StanWalcze(me);
            //jak wiecej przeciwnikow... to to samo
            //potem mozna dodac nastepny zestaw strategii
        default:
            me.setDebugProperty("State Strategy:", "ManyOnOne-jeszcze nie umie");
            return new StanWalcze(me);
        }
    }

    @Override
    public void updateStrategies() {
        me.movement = new MovementDoNothing(me);
        me.fireing = new FiringDoNothing(me);
    }

}
