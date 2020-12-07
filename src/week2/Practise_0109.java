package week2;

public class Practise_0109 {
    public static void main(String[] args){
//        画一座房子和一个太阳，定义如下图形：
//        一个黄色的圆（作为太阳）
//        一个蓝色的三角形（作为屋顶）
//        两个正方形（红色作为墙，绿色作为窗）
        Circle sun = new Circle();
        Triangle roof = new Triangle();
        Square wall = new Square();
        Square window = new Square();

//        定义太阳的颜色、大小、位置
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-50);
        sun.changeSize(80);
        sun.makeVisible();

//        定义屋顶的颜色、大小、位置
        roof.changeColor("blue");
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

//        定义墙的颜色、大小、位置
        wall.changeColor("red");
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();

//        定义窗的颜色、大小、位置
        window.changeColor("green");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

    }
}
