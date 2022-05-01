package to_dos.abstract_factory;

/* Create the AbstractFactoryTest class which uses the FactoryProducer 
 * to get AbstractFactory in order to get factories 
 * of concrete classes by passing an information such as type.
 */

public class AbstractFactoryTest {
	//TO-DO: Implement the main() method for testing purpose
	public static void main(String[] args) {
		// get shape factory
 		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		// get an object of Shape Rectangle
 		Rectangle rectangle = (Rectangle) shapeFactory1.getShape("Rectangle");
		// call draw method of Shape Rectangle
 		rectangle.draw();
		// get an object of Shape Square
 		Square square = (Square) shapeFactory1.getShape("Square");
		// call draw method of Shape Square
 		square.draw();
		// get shape factory
		AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
		// get an object of Shape Rectangle
		Rectangle rectangle2 = (Rectangle) shapeFactory2.getShape("Rectangle");
		// call draw method of Shape Rectangle
		rectangle.draw();
		// get an object of Shape Square
		Square square2 = (Square) shapeFactory2.getShape("Square");
		// call draw method of Shape Square
		square.draw();
	}
}