package Prac_10;

public class ChairFactory implements AbstactChairFactory {
    public VictorianChair createVictorianChair(int x){
        return new VictorianChair(x);
    }
    public MagicChair createMagicChair(){
        return new MagicChair();
    }
    public FunctionalChair createFunctionalChair(){
        return new FunctionalChair();
    }
}
