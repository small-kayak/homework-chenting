package week2;

public class Practise_0106 {
    public static void main(String[] args){
//        创建一个圆和一个正方形
        Circle circle = new Circle();
        Square square = new Square();

//        让圆和正方形可见
        circle.makeVisible();
        square.makeVisible();

//        输入颜色时，忘记加双引号“”，会导致什么“
//        报错：java: 找不到符号
//        circle.changeColor(red);
    }
}
