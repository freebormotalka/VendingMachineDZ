public class HotDrinksMachine implements VendingMachine {
    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        return new HotDrinkWithTemperature(name, volume, temperature);
    }
}