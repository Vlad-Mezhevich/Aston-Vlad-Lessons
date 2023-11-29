package figure;

public class Circle extends Figure {

    private double radius;

    public Circle(Color background, Color border, double radius) {
        super(FigureType.CIRCLE, background, border);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double areа() {
        return Math.PI * (radius * radius);
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
