package figure;

public enum Color {

    Blue("Голубой"),
    Green("Зеленый"),
    Black("Черный"),
    White("Белый"),
    Brown("Бурый");

    private String color;

    Color(String color){
        this.color=color;
    }

    String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return color;
    }

}
