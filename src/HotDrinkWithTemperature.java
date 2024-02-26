public class HotDrinkWithTemperature extends HotDrink {
    int temperature;
    HotDrinkWithTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
    @Override
    void serve() {
        super.serve();
        System.out.println("Температура напитка: " + temperature + " градусов");
    }
}