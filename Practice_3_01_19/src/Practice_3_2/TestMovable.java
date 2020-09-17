package Practice_3_2;

public class TestMovable {
    public static void main(String arg[]){
        MovablePoint o1 = new MovablePoint(3, 3, 1, 2);
        MovableCircle o2 = new MovableCircle(2,9, 1, 1,4);
        MovableRectangle o3 = new MovableRectangle(6,6,1,3,4,4);
        o1.moveRight();
        System.out.println(o1.toString());
        o2.moveDown();
        System.out.println(o2.toString());
        o3.moveUp();
        System.out.println(o3.toString());
    }
}
