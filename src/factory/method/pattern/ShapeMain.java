package factory.method.pattern;

public class ShapeMain {

    public static void main(String [] args){
        ShapeFactory factory = new ShapeFactory();
        Shape s = factory.getShapeObject("circle");
        s.show();
        Shape s1 = factory.getShapeObject("rectangle");
        s1.show();
    }
}
