package Lab_1;

public class Plate extends Dish{
    private String drawing;
    public Plate(String color, String drawing){
        this.color = color;
        this.drawing = drawing;
    }
    public String getDrawing() {
        return drawing;
    }
    public void setVolume(String drawing) {
        this.drawing = drawing;
    }
    @Override
    public String toString(){
        return "Color: "+color+", drawing"+drawing;
    }

}
