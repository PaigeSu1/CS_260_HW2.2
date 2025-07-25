
public class AdapterPatternDemo {
    //This is the main class that is called a different name
    public static void main(String[] args) {
    //Creating instances of Shape objects
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        //using the draw() method of shape
        rectangle.draw();
        circle.draw();

        //using the adapter to allow geometricShapes to work as shape
        GeometricShape geometricRectangle = new GeometricRectangle();
        GeometricShape geometricCircle = new GeometricCircle();

        Shape adaptedRectangle = new ShapeAdapter(geometricRectangle);
        Shape adaptedCircle = new ShapeAdapter(geometricCircle);

        //Using the draw() method from Shape interface via the adapter
        adaptedRectangle.draw();
        adaptedCircle.draw();
    }
}