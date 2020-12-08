package Lab_10;

public class Ex2<E> {
    private Object[] mass;
    public void intoMass(E[] emass){
        this.mass = new Object[emass.length];
        for(int i = 0; i < emass.length; i++){
            mass[i] = emass[i];
        }
    }
}
