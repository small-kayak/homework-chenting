package week2;

public class Practise_0105 {
    public static void main(String[] args){
//        创建一个圆和一个正方形
        Circle circle = new Circle();
        Square square = new Square();

//        让圆和正方形可见
        circle.makeVisible();
        square.makeVisible();

//        输入让系统无法识别的颜色种类
//        系统默认把圆变成黑色
        circle.changeColor("purple");
    }
}
