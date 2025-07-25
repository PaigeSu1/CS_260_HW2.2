public class ShapeAdapter implements Shape{
    private GeometricShape geometricShape;

    //constructor to wrap the geometricShape object
    public ShapeAdapter(GeometricShape geometricShape){
        this.geometricShape = geometricShape;
    }

    @Override
    public void draw(){
        //Adapter calls the legacy method from geometrics shape
        geometricShape.drawShape();
    }
}
