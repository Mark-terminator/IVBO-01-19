package Lab_1;

public abstract class Dish {
    protected String color;
    public Dish(){
    }
    public Dish(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public abstract String toString();
}
