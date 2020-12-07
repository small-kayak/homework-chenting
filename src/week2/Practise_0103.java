package week2;

public class Practise_0103 {
    public static void main(String[] args){
//        创建一个圆和一个正方形
        Circle circle = new Circle();
        Square square = new Square();

//        让圆和正方形可见
        circle.makeVisible();
        square.makeVisible();

//        用moveVertical方法把圆向上移动70个像素
//        y轴的正方向向下
        circle.moveVertical(-70);

//        用moveHorizontal方法把圆向左移动70个像素
//        x轴的正方向向右
        circle.moveHorizontal(-70);
    }
}
