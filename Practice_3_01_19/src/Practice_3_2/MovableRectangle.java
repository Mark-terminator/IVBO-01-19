package Practice_3_2;

import Practice_3_2.MovablePoint;

public class MovableRectangle extends MovablePoint {
    private MovablePoint topLeft = new MovablePoint();
    private MovablePoint bottomRight = new MovablePoint();
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }
    public boolean speed(){
        if ((topLeft.ySpeed == bottomRight.ySpeed) && (topLeft.xSpeed == bottomRight.xSpeed)){
            return true;
        }
        else return false;
    }
    public String toString(){
        return "x1: " + topLeft.x +", y1: " + topLeft.y + ", x2: " + bottomRight.x +", y2: " + bottomRight.y + ", xSpeed: "+bottomRight.xSpeed+", ySpeed: "+bottomRight.ySpeed;
    }
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
