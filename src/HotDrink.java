public class HotDrink {
    private String name;
    private int volume;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double cost) {
        this.volume = volume;
    }
    HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    void serve() {
        System.out.println("Выдается напиток: " + name + ", объем: " + volume + " мл");
    }
}