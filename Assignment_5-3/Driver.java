public class Driver {
    public static void main(String[] args) {
        Circle spot = new Circle();
        
        spot.setRadius(3);
        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle circumference: " + spot.circumference());
        
        Circle circle1 = new Circle(0.55);
        System.out.println("Circle radius: " + circle1.getRadius());
        
        Circle.displayAreaFormula();
    }
}