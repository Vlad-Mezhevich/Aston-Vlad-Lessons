import java.util.Date;

public class Park {

    Attractions attraction;
    String timeWork;
    Double price;

    public Park(Attractions attraction, String timeWork, Double price) {
        this.attraction = attraction;
        this.timeWork = timeWork;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Парк атракционов = {" +
                "Атракцион: " + attraction +
                "; Время работы: " + timeWork +
                "; Стоимость: " + price +
                '}';
    }


}
