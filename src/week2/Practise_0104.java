package week2;

public class Practise_0104 {
    public static void main(String[] args){
//        创建一个圆和一个正方形
        Circle circle = new Circle();
        Square square = new Square();

//        让圆和正方形可见
        circle.makeVisible();
        square.makeVisible();

//        用changeColor方法改变圆的颜色
        circle.changeColor("yellow");
    }
}
