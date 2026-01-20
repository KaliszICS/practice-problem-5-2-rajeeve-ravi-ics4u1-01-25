/**
 * The type Circle.
 */
class Circle {
    private double radius;

    /**
     * Instantiates a new Circle.
     *
     * @param radius the radius
     */
// Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Diameter double.
     *
     * @return the double
     */
// Returns the diameter (2 * r)
    public double diameter() {
        return 2 * radius;
    }

    /**
     * Perimeter double.
     *
     * @return the double
     */
// Returns the perimeter/circumference (2 * pi * r)
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Area double.
     *
     * @return the double
     */
// Returns the area of the circle (pi * r^2)
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
// Getter and Setter
    public double getRadius() {
        return radius;
    }

    /**
     * Sets radius.
     *
     * @param radius the radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

/**
 * Sphere inherits from Circle
 */
class Sphere extends Circle {

    /**
     * Instantiates a new Sphere.
     *
     * @param radius the radius
     */
// Constructor uses Circle's constructor via super
    public Sphere(double radius) {
        super(radius);
    }

    /**
     * Overridden area method for Surface Area
     * Formula: 4 * pi * r^2
     */
    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    /**
     * Volume of the sphere
     * Formula: (4/3) * pi * r^3
     *
     * @return the double
     */
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }
}
