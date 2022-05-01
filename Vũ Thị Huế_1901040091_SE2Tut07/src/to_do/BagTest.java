package to_do;

public class BagTest {
    public static void main(String[] args) {
        ArrayBag<String> cakes = new ArrayBag<String>();
        cakes.add("Donut");
        cakes.add("Cow");
        cakes.add("Milk flavor");
        cakes.add("Cow");
        System.out.println("Frequency of Cows: " + cakes.getFrequencyOf("Cow"));
        System.out.println("Cake bag is empty: "+cakes.isEmpty());
        System.out.println("Number of cakes: " + cakes.getCurrentSize());
        System.out.println("cake bag contains Donut: " + cakes.contains("Donut"));
        cakes.remove("Donut");
        System.out.println("Number of cakes after: " + cakes.getCurrentSize());
        System.out.println("cake bag contains Donut: " + cakes.contains("Donut"));
        cakes.clear();
        System.out.println(" Number of cakes after clear: " + cakes.getCurrentSize());

    }
}
