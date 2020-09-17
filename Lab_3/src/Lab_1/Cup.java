package Lab_1;

public class Cup extends Dish{
    protected double volume;
    public Cup(String color, double volume){
        this.color = color;
        this.volume = volume;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    @Override
    public String toString(){
        return "Color: "+color+", volume"+volume;
    }
}
