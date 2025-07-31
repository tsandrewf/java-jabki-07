package shape;

public abstract class Shape {
    public abstract double area();

    public void displayArea() {
        System.out.printf("Площадь фигуры: %s\n", this.area());
    }
}
