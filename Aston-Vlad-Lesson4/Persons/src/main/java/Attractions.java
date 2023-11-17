public enum Attractions {

    Slides("Американские горки"),
    Сarousel("Карусель");
    private String attraction;

    Attractions(String attraction) {
        this.attraction = attraction;
    }

    String getAttraction() {
        return attraction;
    }

    @Override
    public String toString() {
        return getAttraction();
    }

}
