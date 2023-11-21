public enum Color {

    Blue("Голубой"),
    Green("Зеленый"),
    Black("Черный"),
    BlackWhite("Черно-белый"),
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
