package Practice_3_2;

public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center = new MovablePoint();
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }
    public String toString(){
        return "x: " + center.x +", y: " + center.y + ", xSpeed: "+center.xSpeed+", ySpeed: "+center.ySpeed+", radius" + radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }
    @Override
    public void moveDown() {
        center.moveDown();
    }
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    @Override
    public void moveRight() {
        center.moveRight();
    }
}
