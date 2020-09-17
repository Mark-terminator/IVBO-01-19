package Practice_3_2;

import Practice_3_2.Movable;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(){
        x = 1;
        y = 1;
        xSpeed = 1;
        ySpeed = 1;
    }
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "x: " + x +", y: " + y + ", xSpeed: "+xSpeed+", ySpeed: "+ySpeed;
    }
    @Override
    public void moveUp(){
        y+=ySpeed;
    }
    @Override
    public void moveDown(){
        y-=ySpeed;
    }
    @Override
    public void moveLeft(){
        x-=xSpeed;
    }
    @Override
    public void moveRight(){
        x+=xSpeed;
    }
}
