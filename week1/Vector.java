package week1;

/*
* Step 0: Define a class with main() method, call to
* System.out.println() in that method, nothing else
* Step 1: Add instance variables
* Step 2: Add constructor
* Step 3: Add toString() method, add code that creates an instance
* of the class in main() method, add code in main() method that
* prints vector
* Step 4: Add getters using refactor / encapsulate fields command,
* add code in main() method that exercises the new methods
* Step 5: Add method to compute a dot product of 2 vectors and code
* to test the method
* Step 6: Add method to compute magnitude of a vector and code to
* test the method
*/
public class Vector {
    
    private double x;
    private double y;
    private double h;
    
    public Vector(double x, double y){
        this.x = x;
        this.y = y;
        this.h = 1.0;
    } //Vector(double, double)
    
    public double getX() {
        return this.x;
    } //getX()

    public double getY() {
        return this.y;
    } //getY()

    public double getH() {
        return this.h;
    } //getH()
    
    public double dot(Vector other){
        return this.getX() * other.getX() + this.getY() * other.getY();
    } //dot(Vector)
    
    public double magnitude(){
        return Math.sqrt(this.dot(this));
    } //magnitude()
    
    @Override
    public String toString(){
        return String.format("(%8.4f,%8.4f)", this.getX(), this.getY());
    } //toString()

    public static void main(String[] args) {
        Vector u = new Vector(3, 4);
        System.out.println("u = " + u);
        System.out.println("x component of u = " + u.getX());
        System.out.println("y component of u = " + u.getY());
        System.out.println("h component of u = " + u.getH());
        Vector v = new Vector(5, 12);
        System.out.println("Dot product = " + u.dot(v));
        System.out.println("Magnitude of u = " + u.magnitude());
        System.out.println("Magnitude of v = " + v.magnitude());
    } //main(String[])
    
} //Vector
