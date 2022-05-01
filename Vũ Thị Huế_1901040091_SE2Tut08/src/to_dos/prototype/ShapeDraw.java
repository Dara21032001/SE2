package to_dos.prototype;

/* Create the ShapeDraw class which uses ShapeCache class 
to get clones of shapes stored in a Hashtable. */
public class ShapeDraw {
	// TO-DO: Implement the main() method for testing purpose
	public static void main(String[] args) {
		// run loadCache() method
		ShapeCache.loadCache();
		/*
		 * create 3 cloned shapes with 3 different types Hint: use getShape() &
		 * getType() methods
		 */
		Shape cloneS1 = ShapeCache.getShape("SC1");
		Shape cloneS2 = ShapeCache.getShape("SR1");
		Shape cloneS3 = ShapeCache.getShape("SS1");
		System.out.println("Shape " + cloneS1.getType());
		System.out.println("Shape " + cloneS2.getType());
		System.out.println("Shape " + cloneS3.getType());
	}
}