package BOOP.Chapter1;

public class MountainBike implements Bicycle, IsMaintenance {
    @Override
    public void drive() {
        System.out.println("Sepeda berjalan");
    }

    @Override
    public int getTire() {
        return 2;
    }

    @Override
    public void brake() {
        System.out.println("BRAKEEEEEE");
    }

    @Override
    public String getBrand() {
        return "KENZO";
    }

    @Override
    public void oilChange() {
        System.out.println("Ganti oli");
    }
}
