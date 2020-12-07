package week2;

public class Practise_0102 {
    public static void main(String[] args){
//        创建一个圆和一个正方形
        Circle circle = new Circle();
        Square square = new Square();

//        让圆和正方形可见
        circle.makeVisible();
        square.makeVisible();

//        调用两次moveDown，圆向下移两次20
        circle.moveDown();
        circle.moveDown();

//        连续调用两次makeInvisible，正方形保持消失
        square.makeInvisible();
        square.makeInvisible();
    }
}
