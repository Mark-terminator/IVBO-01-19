package Practice_3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        this.filled = false;
        this.color = "blue";
        width = 1;
        length = 1;
    }
    public Rectangle(boolean filled, String color, double width, double length){
        this.filled = filled;
        this.color = color;
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length){
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return (width+length)*2;
    }
    @Override
    public String toString(){
        return "Shape: rectangle, width: "+width+", length: "+color+", color:"+color;
    }
}
