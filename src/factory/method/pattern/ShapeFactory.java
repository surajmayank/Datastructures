package factory.method.pattern;

public class ShapeFactory {


    public Shape getShapeObject(String item){

        if(item.equalsIgnoreCase("CIRCLE"))
            return new Cirlce();
        if(item.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        return null;
    }
}
