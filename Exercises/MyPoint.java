package Exercises;

public class MyPoint {

    private int x = 0;
    private int y = 0;


    public MyPoint(){

    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int XY[] = {x,y};
        return XY;
    }

    public void setXY(int x,int y){
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "Exercises.MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y){
        return -1;
    }

    public double distance(MyPoint another){
        return (another.y - y) * (another.y - y) + (another.x - x) * (another.x - x);
    }

    public double distance(){
        return (0 - y) * (0 - y) + (0 - x) * (0 - x);

    }

}
