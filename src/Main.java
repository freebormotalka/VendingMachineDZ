public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new HotDrinksMachine();
        HotDrink[] drinks = new HotDrink[]{
                new HotDrinkWithTemperature("Чай", 300, 80),
                new HotDrinkWithTemperature("Кофе", 250, 70),
                new HotDrinkWithTemperature("Какао", 200, 60)
        };

        // Случайный выбор напитка из массива
        int index = (int) (Math.random() * drinks.length);
        HotDrink product = drinks[index];
        product.serve();
    }
}