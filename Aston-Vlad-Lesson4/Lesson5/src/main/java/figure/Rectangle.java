package figure;

public class Rectangle extends Figure {

    private double side1;
    private double side2;

    public Rectangle(Color background, Color border, double side1, double side2) {
        super(FigureType.RECTANGLE, background, border);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double perimeter() {
        return 2 * side1 + 2 * side2;
    }

    @Override
    public double areа() {
        return side1*side2;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "Площадь: " + areа() +
                ", Периметр " + perimeter() +
                ", Цвет фона " + getBackground() +
                ", Цвет границы: " + getBorder() + "." +
                '}';
    }

}
