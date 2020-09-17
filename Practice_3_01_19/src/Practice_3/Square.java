package Practice_3;

public class Square extends Rectangle{
    public Square(){
        this.filled = false;
        this.color = "blue";
        this.width = 1;
        this.length = 1;
    }
    public Square(double side){
        this.filled = false;
        this.color = "blue";
        this.width = side;
        this.length = side;
    }
    public Square(double side, boolean filled, String color){
        this.filled = filled;
        this.color = color;
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double side){
        this.width = side;
    }
    @Override
    public void setLength(double side){
        this.length = length;
    }
    @Override
    public String toString(){
        return "Shape: square, side: "+width+", color:"+color;
    }
}
