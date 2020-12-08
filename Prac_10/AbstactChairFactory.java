package Prac_10;

import java.util.function.Function;

public interface AbstactChairFactory {
    public VictorianChair createVictorianChair(int x);
    public MagicChair createMagicChair();
    public FunctionalChair createFunctionalChair();
}
