package week2;

public class Practise_0115 {
    public static void main(String[] args){
//        创建一个Circle实例
        Circle sun2 = Picture.getSun2();

//        使太阳可见
        sun2.makeVisible();

//        用Circle类的slowMoveVertical方法实现日落
        sun2.slowMoveVertical(100);

    }
}
