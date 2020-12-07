package week2;

public class Practise_0107 {
    public static void main(String[] args){
//        创建多个圆和其他图形
        Circle circle01 = new Circle();
        Circle circle02 = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

//        让它们可见
        circle01.makeVisible();
        circle02.makeVisible();
        square.makeVisible();
        triangle.makeVisible();

//        改变它们的位置、大小和颜色
        circle01.changeSize(100);
        circle01.changeColor("yellow");
        circle01.moveHorizontal(-150);

        circle02.changeSize(30);
        circle02.changeColor("green");
        circle02.moveVertical(-50);

        triangle.changeSize(140, 130);

    }
}
